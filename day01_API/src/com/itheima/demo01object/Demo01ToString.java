package com.itheima.demo01object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    java.lang.Object类
    类Object是类层次结构的根（最顶层）类。每个类都是用Object作为超类/父类。
    所有对象（包括数组）都实现这个类的方法。
*/
public class Demo01ToString {
    public static void main(String[] args) {
        //Person类默认继承了Object类，所以可以使用Object类中的toString方法
        Person p = new Person("张三", 20);
        String s = p.toString();
        System.out.println(s);//com.itheima.demo01.demo01object.Person@75412c2f

        //直接打印对象的名字，其实就是调用对象的toString方法
        System.out.println(p);//com.itheima.demo01.demo01object.Person@75412c2f
        //没重写Object类的 toString方法时，不论是打印对象还是打印对象的toString
        //得出的都是对象的地址值。

        /*看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可。
        * 如果没有重写toString方法,那么打印的就是对象的地址值(默认)
        * 如果重写了,那么就按照重写的方式打印.
        * */
        Random random = new Random();
        System.out.println(random);//没重写toString方法.

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);//重写toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);//[1,2] 重写了toString 方法.
    }
}
