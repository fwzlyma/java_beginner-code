package com.itheima.demo01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.List接口 extends Collection 接口
    List接口的特点：
        1.有序的集合，存储元素和取出元素的顺序是一致的（存123 取出123）
        2.有索引，包含了一些带索引的方法
        3.允许存储重复的元素。

    List接口中带索引的方法（特有）
        -public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        -public E get(int index):返回集合中指定位置的元素。
        -public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        -public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
    【注意事项】
        操作索引的时候，一定要防止索引越界异常
        IndexOutOfBoundsException:索引越界异常，集合会报错
        ArrayIndexOutOfBoundsException:数组索引越界异常
        StringIndexOutOfBoundsException:字符串索引越界异常
*/
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法向集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//[a, b, c, d, a]

        //public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        //在c和d之间添加一个itheima
        list.add(3, "itheima");
        System.out.println(list);//[a, b, c, itheima, d, a]
        //public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        //移除元素
        String removeE = list.remove(2);
        System.out.println("被移除的元素："+removeE);//被移除的元素：c
        System.out.println(list);//[a, b, itheima, d, a]
        //public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        //把最后一个a替换为A
        String setE = list.set(4, "A");
        System.out.println("被替换的元素："+setE);//被替换的元素：a
        System.out.println(list);//[a, b, itheima, d, A]
        System.out.println("=============================");

        //List集合的遍历方式：
        //1.for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=============================");
        //2.迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=============================");
        //3.增强for
        for (String s : list) {
            System.out.println(s);
        }
    }
}