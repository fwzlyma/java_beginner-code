package com.itheima.demo04Calendar;

import java.util.Calendar;
import java.util.Date;

/*
    demo04Calendar 类的成员方法：
        1.public int get(int field)返回给定日历字段的值。
        2.public void set(int field,int value):
            将给定的日历字段设置为给定值。
        3.public abstract void add(int field,int amount):
            根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        4.public final Date getTime():
            返回一个表示此 demo04Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
    成员方法的参数：
        int field ：日历类的字段，可以使用Calendar类的静态成员变量获取.
            public static final int YEAR = 1;年
            public static final int MONTH = 2;月
            public static final int DATE = 5;月中的某一天
            public static final int DAY_OF_MONTH = 5; 月中的某一天
            public static final int HOUR = 10; 时
            public static final int MINUTE = 12;分
            public static final int SECOND = 13;秒
*/
public class Demo02Calendar {
    public static void main(String[] args) {
        demo04();
        //ctrl + shift + enter 行末加;
    }
    /*
        public int get(int field):返回给定日历字段的值。
        参数：传递指定的日历字段（YEAR, MONTH ...）
        返回值：日历字段代表具体的值
    */
    private static void demo01() {
        //使用getInstance()方法获取Calendar 对象--demo04Calendar 抽象！
        Calendar instance = Calendar.getInstance();
        //1.获取Calendar对象的年
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);//2021
        //2.获取Calendar对象的月
        int month = instance.get(Calendar.MONTH);
        System.out.println(month);//7  ->  7+1 = 8月份 (0-11)
        //3.获取Calendar对象的天（月中某一天）
        int date = instance.get(Calendar.DATE);
        System.out.println(date);//12 今天是8.12 ，返回的是这个月的第12天，12.
        //3.2获取Calendar对象的天（月中的某一天）
        int date2 = instance.get(Calendar.DAY_OF_MONTH);
//        demo05System.out.println(date2);//12
        //4.获取Calendar对象的时
        int hour = instance.get(Calendar.HOUR);
        System.out.println(hour);//4,现在是下午四点，返回的应该是12小时制的时间
        //5.获取Calendar对象的分
        int minute = instance.get(Calendar.MINUTE);
        System.out.println(minute);//52,现在是下午四点52分
        //6.获取Calendar对象的秒
        int sec = instance.get(Calendar.SECOND);
        System.out.println(sec);//42
    }
    /*
        public void set(int field, int value):将给定的日历字段设置为给定值。
        参数：
            int field:传递指定的日历字段(YEAR,MONTH...)
            int value:传递的字段设置的具体的值.
    */
    private static void demo02() {
        //使用getInstance()获取Calendar子类对象
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR,9999);
        //同时设置年月日
        /*instance.set(8888,8,8);*/
        /*
            public final void set(int year, int month, int demo03date){
                set(YEAR, year);
                set(MONTH, month);
                set(DATE, demo03date);
            }
        */
        //1.获取Calendar对象的年
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);//9999--更改成功
        //2.获取Calendar对象的月
        int month = instance.get(Calendar.MONTH);
        System.out.println(month);//7  ->  7+1 = 8月份 (0-11)
        //3.获取Calendar对象的天（月中某一天）
        int date = instance.get(Calendar.DATE);
        System.out.println(date);//12 今天是8.12 ，返回的是这个月的第12天，12.
        //3.2获取Calendar对象的天（月中的某一天）
        int date2 = instance.get(Calendar.DAY_OF_MONTH);
//        demo05System.out.println(date2);//12
        //4.获取Calendar对象的时
        int hour = instance.get(Calendar.HOUR);
        System.out.println(hour);//4,现在是下午四点，返回的应该是12小时制的时间
        //5.获取Calendar对象的分
        int minute = instance.get(Calendar.MINUTE);
        System.out.println(minute);//59,现在是下午四点59分
        //6.获取Calendar对象的秒
        int sec = instance.get(Calendar.SECOND);
        System.out.println(sec);//34
    }
    /*
        3.public abstract void add(int field,int amount):
            根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        把指定的字段增加/减少指定的值
        参数：
            int field: 传递指定的日历字段(YEAR, MONTH...)
            int amount: 增加/减少的值
                正数：增加
                负数：减少
    */
    private static void demo03() {
        //同样先创建一个对象Calendar.getInstance()实现子类对象的创建
        Calendar instance = Calendar.getInstance();
        //增加、减少字段值
        int beforeYear = instance.get(Calendar.YEAR);
        instance.add(Calendar.YEAR,-1);
        int laterYear = instance.get(Calendar.YEAR);
        System.out.println(beforeYear);//2021
        System.out.println(laterYear);//2020
        System.out.println("------------------");

        int beforeMonth = instance.get(Calendar.MONTH);
        instance.add(Calendar.MONTH,2);
        int laterMonth = instance.get(Calendar.MONTH);
        System.out.println(beforeMonth);//7 -> 表示8月份
        System.out.println(laterMonth);//9 -> 表示10月份，增加了两个月。
    }
    /*
        public final Date getTime():
            返回一个表示此 demo04Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
        把日历对象，转换为日期对象。
    */
    // demo04Calendar   ->(demo04Calendar 对象的getTime())  Date对象   ->(*.getTime())    转换为毫秒值
    //即:  (日历)  ->getTime  (日期)   ->getTime   (毫秒值)
    public static void demo04(){
        //获取Calendar对象
        Calendar instance = Calendar.getInstance();
        //1.getTime()获取日期对象
        Date date = instance.getTime();
        System.out.println(date);//Thu Aug 12 17:42:36 CST 2021
        //2.getTime()获取毫秒值
        long mills = date.getTime();
        System.out.println(mills);//1628761421537
    }
}
