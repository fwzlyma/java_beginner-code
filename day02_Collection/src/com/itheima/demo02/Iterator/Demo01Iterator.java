package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个常用的方法：
        boolean hasNext() : 如果仍有元素可以迭代，则返回true。
            判断集合中还有没有下一个元素，有就返回true，没有返回false
        E next() 返回迭代的下一个元素。
            去除集合中下一个元素
    Iterator 迭代器是一个接口，无法直接使用，需要使用Iterator接口的实现类对象，获取类的方式比较特殊
    Collection接口中有一个方法，叫Iterator(),这个方法返回的就是迭代器的实现类对象。
        Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

    迭代器的使用步骤【重点】：
        1.使用集合中的方法iterator()获取迭代器的实现类对象，使用iterator接口接收（多态）
        2.使用iterator接口中的方法hasNext判断有没有下一个元素
        3.使用Iterator接口中的方法next取出集合的下一个元素。
*/
public class Demo01Iterator {
    public static void main(String[] args) {
        //1.创建一个集合对象
        Collection<String> collection = new ArrayList<>();
        //2.往集合中添加元素
        collection.add("迪丽热巴");
        collection.add("古力娜扎");
        collection.add("刘诗诗");
        collection.add("吴奇隆");
        collection.add("黄晓明");
        //3.使用迭代器遍历集合
        /*
            1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
            【注意】
                Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型。
        */
        //3.1 多态
        //要取哪个对象，定义哪个对象的iterator,再alt+enter.
        //   接口                实现类对象
        Iterator<String> it = collection.iterator();
        //3.2 使用Iterator接口中的方法hasNext判断也没有下一个元素。
        boolean b = it.hasNext();
        System.out.println(b);//true
        //3.3 使用Iterator接口中的方法next去除集合中的下一个元素
        String s = it.next();
        System.out.println(s); // 迪丽热巴

        while(it.hasNext()){
            System.out.println(b);
            System.out.println(it.next());//没有元素再取会有异常
            /*b = it.hasNext();*/
        }
        //3.3.2 也可以使用for循环遍历集合
        System.out.println("===================================");
        for (Iterator<String> it2 = collection.iterator();it2.hasNext();){
            System.out.println(it2.next());
        }
    }
}
