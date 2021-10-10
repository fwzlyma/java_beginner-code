package com.itheima.demo06StringBuilder;

/*
    java.lang.StringBuilder类：字符串缓冲区，可以提高字符串的效率
    构造方法：
        -public StringBuilder(int capacity)：
            构造一个不带任何字符的字符串生成器，其初始容量由 capacity 参数指定。
        -public StringBuilder(String str)
            构造一个字符串生成器，并初始化为指定的字符串内容。该字符串生成器的初始容量为 16 加上字符串参数的长度。
*/
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);//

        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);//abc
    }
}
