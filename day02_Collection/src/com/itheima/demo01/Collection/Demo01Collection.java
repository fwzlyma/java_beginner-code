package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    java.util.Collection 接口
        所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法

    共性的方法：
        public boolean add(E e)`：  把给定的对象添加到当前集合中 。
        public void clear()` :清空集合中所有的元素。
        public boolean remove(E e)`: 把给定的对象在当前集合中删除。
        public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
        public boolean isEmpty()`: 判断当前集合是否为空。
        public int size()`: 返回集合中元素的个数。
        public Object[] toArray()`: 把集合中的元素，存储到数组中。
*/
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> collection = new ArrayList<>();
        /*Collection<String> collection = new HashSet<>();*/
        System.out.println(collection);//[],重写了toString方法
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        /*
            public boolean add(E e)`：  把给定的对象添加到当前集合中 。
            返回值是一个boolean值，一般都返回true，所以可以不用接收。
        */
        boolean b1 = collection.add("迪丽热巴");
        System.out.println("b1:"+b1);
        System.out.println(collection);//[迪丽热巴]
        collection.add("张三");
        collection.add("李四");
        collection.add("刘诗诗");
        /*
            public boolean remove(E e)`: 把给定的对象在当前集合中删除。
            返回值是一个boolean值，集合中存在元素，删除元素返回true
                                 集合不存在元素，删除失败返回false
        */
        System.out.println(collection);//[迪丽热巴, 张三, 李四, 刘诗诗]
        //删除李四
        collection.remove("李四");
        System.out.println(collection);//[迪丽热巴, 张三, 刘诗诗]
        //删除不存在的
        boolean b2 = collection.remove("古力娜扎");
        System.out.println("b2:"+b2);//false
        System.out.println(collection);//[迪丽热巴, 张三, 刘诗诗]
        /*
            public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
            包含返回true
            不包含返回false
        */
        boolean b3 = collection.contains("李四");
        System.out.println("b3:"+b3);//b3:false
        /*
            public boolean isEmpty()`: 判断当前集合是否为空。
        */
        System.out.println(collection.isEmpty());//false
        /*
            public int size()`: 返回集合中元素的个数。
        */
        int size = collection.size();
        System.out.println(size);//3

        //public Object[] toArray()`: 把集合中的元素，存储到数组中。
        Object[] arr = collection.toArray();
        for (Object i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //public void clear()` :清空集合中所有的元素。不删除集合。
        collection.clear();
        System.out.println(collection);//[]
    }
}
