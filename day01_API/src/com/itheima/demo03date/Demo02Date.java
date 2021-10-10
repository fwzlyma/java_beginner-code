package com.itheima.demo03date;

import java.util.Date;

public class Demo02Date {
    //3点重要：1.Date无参 2.Date有参 3.demo03date.getTime()
    public static void main(String[] args) {
        demo03();
    }
    //Date类的成员方法：long getTime() 把日期转换为毫秒
    /*
        相当于System.currentTimeMillis()
        返回自1970年1月1日00:00:00 GMT 以来此 Date对象表示的毫秒数。
    */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//1628736544681
//        demo05System.out.println(new Date(1628736544681L));
    }

    //Date类的带参数构造方法：Date(long demo03date):传递毫秒值，把毫秒转换为Date日期
    private static void demo02() {
        Date d1 = new Date(0L); //0L -- 0毫秒表示“时间原点”
        System.out.println(d1);

        Date d2 = new Date(100000000L);
        System.out.println(d2);
    }

    //Date类的空参数构造方法:获取的就是当前系统的日期和时间
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
