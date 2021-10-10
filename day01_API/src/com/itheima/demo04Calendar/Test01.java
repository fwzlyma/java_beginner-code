package com.itheima.demo04Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws ParseException {
//        testDate();
//        testDateFormat();
        testCalendar();
    }

    private static void testDate() {
        //1.空参构造方法
        Date date = new Date();
        System.out.println(date);//Thu Aug 12 18:52:59 CST 2021
        //2.根据本地格式查看日期对象
        String lo = date.toLocaleString();
        System.out.println(lo);//2021年8月12日 下午6:53:59
        //3.有参构造方法构造日期对象
        Date date1 = new Date(300000000L);
        System.out.println(date1);//Thu Jan 01 08:00:30 CST 1970
        //4.使用本地格式查看有参构造的日期对象
        String lo2 = date1.toLocaleString();
        System.out.println(lo2);//1970年1月1日 上午8:00:30
    }

    private static void testDateFormat() throws ParseException {
        /*当输出的日期时间不是自己想要的格式的时候就需要用格式化了。*/
        //1.创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //2.创建无参的Date对象获取当前时间
        Date date = new Date();
        //3.将日期对象格式化
        String nowTime = sdf.format(date);
        System.out.println(date);//Thu Aug 12 19:02:58 CST 2021
        System.out.println(nowTime);//2021年08月12日 19时04分53秒
        //4.将一个符合格式的时间字符串转换为时间对象 -- 可以进行其他的操作
        /*大大方便了对日期时间对象的操作便捷性*/
        String oneDay = "1998年12月30日 20时00分00秒";
        Date birthday = sdf.parse(oneDay);
        System.out.println(birthday);//Wed Dec 30 20:00:00 CST 1998

    }

    private static void testCalendar() {
        /*日历类是一个抽象类，不能直接创建对象*/
        //1.使用Calendar.getInstance()创建子类对象
        Calendar c = Calendar.getInstance();
        //2.get
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int sec = c.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+day+"日 "+hour+"时"+minute+"分"+sec+"秒");
        //3.set
        //alt + 鼠标左键可以实现选前几列的功能
        c.set(Calendar.YEAR,9999);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DAY_OF_MONTH,31);
        c.set(Calendar.HOUR,11);//只有12小时制，没办法吗？
        c.set(Calendar.MINUTE,59);
        c.set(Calendar.SECOND,59);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        hour = c.get(Calendar.HOUR);
        minute = c.get(Calendar.MINUTE);
        sec = c.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+day+"日 "+hour+"时"+minute+"分"+sec+"秒");
        //4.add
        c.add(Calendar.SECOND, 1);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        hour = c.get(Calendar.HOUR);
        minute = c.get(Calendar.MINUTE);
        sec = c.get(Calendar.SECOND);//加几就是加几--不是1000是1秒了，1就是
        System.out.println(year+"年"+month+"月"+day+"日 "+hour+"时"+minute+"分"+sec+"秒");
    }
}
