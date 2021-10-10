package com.itheima.demo06StringBuilder;

/*
    StringBuilder类的成员方法：
        public StringBuilder append(...):添加任意类型数据的字符串形式，并【返回当前对象自身】。
        参数：
            可以是任意的数据类型。
*/
public class Demo02StringBuilder {
    public static void main(String[] args) {
//        test02();
//        链式编程：
//            方法的返回值是一个对象，可以根据对象继续调用方法
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase().toUpperCase());
        StringBuilder bu1 = new StringBuilder();
        bu1.append("abc").append(123).append(true).append(8.8).append('中');
        System.out.println(bu1);
    }

    //2.bu2==bu1 因此无需每次都接收返回值，可以直接操作bu1
    private static void test02() {
        //1.创建StringBuilder对象
        StringBuilder bu1 = new StringBuilder();
        bu1.append("abc");
        bu1.append("def");
        bu1.append(1);
        bu1.append(true);
        bu1.append(8.8);
        bu1.append('中');
        System.out.println(bu1);
    }

    //1.StringBuilder节省空间的特点。
    private static void test01() {
        //1.创建一个StringBuilder对象
        StringBuilder bu1 = new StringBuilder();
        //2.使用append方法往StringBuilder中添加数据
        /*append方法返回的是this，调用方法的对象bu1*/
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);//abc
        System.out.println(bu2);//abc
        System.out.println(bu1 == bu2);//true 说明两个对象是同一个对象
    }
}
