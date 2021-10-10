package com.itheima.demo04Calendar;

import java.util.Calendar;

/*
    java.util.Calendar类：日历类
    抽象类，demo04Calendar 提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR)
    demo04Calendar 对象无法直接创建对象使用，里边有一个静态方法叫getInstance():返回了Calendar 的子类对象
    public static demo04Calendar getInstance():使用默认时区和语言环境获得一个日历。

*/
public class Demo01Calendar {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        //1.使用多态接收一个Calendar的子类对象  并打印输出
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        /*西方的月份从0-11，所以显示的月份比实际月份小1*/
    }
}
