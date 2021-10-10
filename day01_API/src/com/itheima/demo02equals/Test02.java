package com.itheima.demo02equals;

public class Test02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));//true

        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("张三", 23);
        /*demo05System.out.println(stu1.demo02equals(stu2));*///false 重写方法前
        /*public boolean demo02equals(demo01object obj) {
            return (this == obj);
        }*///stu

        //认为同姓名同年龄就是一个人 -- 重写方法后
        System.out.println(stu1.equals(stu2));//true

    }
}
