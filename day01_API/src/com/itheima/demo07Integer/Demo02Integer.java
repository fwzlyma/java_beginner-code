package com.itheima.demo07Integer;

import java.util.ArrayList;
import java.util.Arrays;

/*
    自动装箱与拆箱：
        基本类型的数据和包装类之间可以自动的相互转换。
        JDK 1.5之后出现的新特性。
*/
public class Demo02Integer {
    public static void main(String[] args) {
        //1.自动装箱：直接把 int 类型的整数赋值给包装类
        Integer integer = 3;
        System.out.println(integer);//3
        //2.自动拆箱：直接把 Integer类型的数据转为基本类型
        integer += 5;
        System.out.println(integer);//8

        //3.包装类的作用：
        //ArrayList无法直接存储整数，可以存储包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int i = list.get(0);//自动拆箱

        //将ArrayList转换为数组
        Object[] arrayList = list.toArray();
        //将对象数组转换为字符串方便查看:
        String str = Arrays.toString(arrayList);
        System.out.println(str);
    }
}
