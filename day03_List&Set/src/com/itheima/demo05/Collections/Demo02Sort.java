package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list): 将集合中元素按照默认规则排序。
    【注意】
        sort(List<T> list)使用前提
        被排序的集合里边存储的元素，必须实现Comparable,重写接口中的方法compareTo定义排序规则。
    Comparable接口的排序规则：
        自己(this) - 参数 ： 升序
*/
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("w");
        arrayList.add("c");
        arrayList.add("e");
        Collections.sort(arrayList);//默认升序。
        System.out.println(arrayList);//[a, b, c, e, w]

        ArrayList<Object> objectArrayList = new ArrayList<>();
        objectArrayList.add("a");
        objectArrayList.add("c");
        objectArrayList.add("b");
        objectArrayList.add(12);
        objectArrayList.add(5);
        objectArrayList.add(1);
        System.out.println(objectArrayList);//[a, c, b, 12, 5, 1]
        //Object类的混合集合不排序，按照添加顺序就是输出顺序。

        //Person自定义类sort
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("张三", 20));
        personArrayList.add(new Person("李斯", 18));
        Collections.sort(personArrayList); //错误！！！
        System.out.println(personArrayList);
    }
}
