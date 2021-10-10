package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections 是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> boolean addAll(Collection<T> c,T... elements):往集合中添加一些元素。
        public static void shuffle(List<?> list)打乱顺序：打乱集合顺序。
*/
public class Demo01Collections {
    public static void main(String[] args) {
        //集合工具类Collections
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //往集合添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        //添加很多个呢？写很多行代码？能一行代码写完？
        //public static <T> boolean addAll(Collection<T> c,T... elements):往集合中添加一些元素。
        Collections.addAll(list, "Hello", "World", "Java", "!!!");
        System.out.println(list);
        //打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
