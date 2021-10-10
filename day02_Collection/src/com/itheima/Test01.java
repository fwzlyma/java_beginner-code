package com.itheima;

import java.util.ArrayList;
import java.util.Collection;

/*
    boolean add (E e): 向集合添加元素
    boolean remove (E e): 删除集合中的某个元素
    void clear();       清空集合所有的元素
    boolean contains(E e): 判断集合是否包含某个元素
    boolean isEmpty();    判断集合是否为空
    int size();          获取集合的长度
    Object[] toArray();  将集合转成一个数组
*/
public class Test01 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> collection = new ArrayList<>();
        //boolean add(E e)
        collection.add("Hello");
        collection.add("World");
        collection.add("heima");
        collection.add("Java");
        System.out.println(collection);//[Hello, World, heima, Java]

        //boolean remove(E e); 删除元素
        boolean result = collection.remove("heima");
        /*public boolean remove(Object o)*/
        System.out.println(result);//true 如果false不会删除任何
        System.out.println(collection);//[Hello, World, Java]

        //void clear();       清空集合所有的元素
        collection.clear();
        System.out.println(collection);//[]

        //boolean contains(E e): 判断集合是否包含某个元素
        collection.add("Java");
        boolean result1 = collection.contains("Java");
        System.out.println(result1);//true

        //boolean isEmpty();    判断集合是否为空
        System.out.println(collection.isEmpty());//false

        //int size();          获取集合的长度
        System.out.println(collection.size());//1

        //Object[] toArray();  将集合转成一个数组
        collection.add("Hello");
        collection.add("World");
        collection.add("heima");
        collection.add("Java");
        Object[] objects = collection.toArray();
        for (Object object : objects) {
            System.out.print(object+" ");
        }
    }
}
