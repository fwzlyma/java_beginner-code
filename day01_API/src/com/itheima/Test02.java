package com.itheima;

public class Test02 {
    public static void main(String[] args) {
        //1.创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //2.使用append向sb里面添加字符串
        /*sb.append("abc");
        sb.append(true);
        sb.append(100);*/
        //链式添加
        sb.append("Hello ").append("World.").append("Java!");
        //reverse方法逆置sb对象字符串
        sb.reverse();
        //3.toString方法
        String str = sb.toString();
        System.out.println(str);//!avaJ.dlroW olleH
    }
}
