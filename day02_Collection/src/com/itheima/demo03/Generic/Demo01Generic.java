package com.itheima.demo03.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
    创建集合对象，不使用泛型
    好处：
        集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
    弊端：
        不安全，会引发异常。
*/
public class Demo01Generic {
    public static void main(String[] args) {
        demo02();
    }

    private static void demo02() {
        /*
            创建集合对象，使用泛型
            好处：
                1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
                2.把运行期异常(代码运行之后会抛出的异常),提升到了编译器(写代码的时候会报错)
            弊端：
                泛型是什么类型，只能存储什么类型的数据。
        */
        //避免了类型转换的麻烦。
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("12345");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
            System.out.println("str.length:"+str.length());
        }
    }

    private static void demo01() {
        //多态    Object  <->  String
        ArrayList<Object> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        //使用迭代器遍历list集合
        //获取迭代器
        Iterator<Object> it = list.iterator();
        //使用迭代器的方法hasNext判断是否可以移动指针。
        while (it.hasNext()){
            //打印并将指针后移
            Object obj = it.next();
            System.out.println(obj);
            //想要使用String特有的方法，但是Object不能用
            //向下转型
            String str = (String) obj;
            System.out.println("str.length:"+str.length());;
        }
    }
}
