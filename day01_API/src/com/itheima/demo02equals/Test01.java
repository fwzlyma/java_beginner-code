package com.itheima.demo02equals;

public class Test01 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);//abc
//        demo05System.out.println(str.toString());

        Student stu = new Student("张三", 23);
        System.out.println(stu);//com.itheima.demo01.demo02equals.Student@75412c2f
        System.out.println(stu.toString());//com.itheima.demo01.demo02equals.Student@75412c2f

//        Alt + 1 == project
//        Alt + 7 == stucture
    }
}
