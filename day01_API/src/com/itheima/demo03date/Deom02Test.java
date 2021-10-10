package com.itheima.demo03date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
练习：
    请使用日期时间相关的API，计算出一个人已经出生了多少天。
分析：
    1.使用Scanner类中的方法next,获取出生日期
    2.使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
    3.把Date格式的出生日期转换为毫秒值
    4.获取当前的日期，转换为毫秒值
    5.使用当前日期的毫秒值减去出生日期的毫秒值，得到相差的毫秒值
    6.把差值毫秒值换成秒 一天86400秒，计算多少天即可
*/
public class Deom02Test {
    public static void main(String[] args) throws ParseException {
        test();
    }

    private static void test() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期(格式yyyy-MM-dd):");
        //获取出生日期
        String str = sc.next();
//        String str = "1998-12-30";

        //1.获取当前日期
        Date date = new Date();
        //2.获取当前日期的毫秒值
        long nowMills = date.getTime();
        //3.解析输入的日期 -- str
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(str);
        //4.获取出生日期的毫秒值
        long birthdayMills = birthday.getTime();
        //5.获取差值毫秒值
        long liveMills = nowMills - birthdayMills;
        //6.转换成天day
        long liveDay = (liveMills / 1000) / 86400;
        System.out.println("您从出生到现在已经过去了"+liveDay+"天");
    }
}
