package com.itheima.demo03date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.text.DateFormat:是日期/时间格式化子类的抽象类
    作用：
        1.格式化： 日期->文本
        2.解析： 文本->日期
    成员方法:
        String format(Date demo03date) 按照指定的模式，把Date日期格式化为符合模式的字符串.
        Date parse(String source) 把符合模式的字符串解析为Date日期
    DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类

    public abstract class DateFormatextends Format 抽象类
    public class SimpleDateFormat extends DateFormat 要继承并重写所有抽象方法。
    java.text.SimpleDataFormat extends DateFormat
    构造方法：
        SimpleDateFormat(String pattern) 用给定的模式和默认语言环境的日期格式符号构造 SimpleFormat.
        参数：
            String pattern ：传递指定的模式
            y 年
            M 月
            d 天
            H 时
            m 分
            s 秒
            写对应的模式：会把模式替换为对应的日期和时间
                "yyyy-MM-dd HH:mm:ss"
                "yyyy年MM月dd日 HH时mm分ss秒"
            注意事项：
                模式中的字母不能更改，连接模式的符号可以改变。
*/
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo02();

    }

    private static void demo02() throws ParseException {
        //1.定义一个SimpleDateFormat对象，定义格式日期、解析日期字符串的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.定义一个日期对象 获取当前系统的日期时间
        Date date = new Date();
        //3.对日期进行格式化并打印
        String text = sdf.format(date);
        System.out.println(text);/*2021-08-12 14:44:13*/
        //4.定义一个模式日期
        String str = "2021-08-12 14:42:00";
        //5.将模式日期通过对应的模式解析成日期对象并打印输出
        Date nowTime = sdf.parse(str);
        System.out.println(nowTime);/*Thu Aug 12 14:42:00 CST 2021*/
    }

    /*
        使用DateFormat类中的方法format，把日期格式化为文本。
        String format(Date demo03date) 按照指定的模式，把Date日期格式化为符合模式的字符串.
        使用步骤：
            1.创建SimpleDateFormat对象，构造方法中传递指定的模式
            2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）
        注意：
            public Date parse(String source) throws ParseException
            parse方法声明了一个异常叫ParseException解析异常
            如果字符串和构造方法中的模式不一样，那么程序就会抛出异常
            调用一个抛出了异常的方法，就必须得处理这个异常，要么throws继续声明抛出这一个异常，要么try...catch自己处理这个异常.

    */
    private static void demo01() throws ParseException {
        //1.创建SimpleDateFormat对象，构造方法中传递指定的模式。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）
        Date date = new Date();
        System.out.println("date日期：\n"+date);//Thu Aug 12 14:11:49 CST 2021
        String text = sdf.format(date);
        System.out.println("使用SimpleDateFormat对象的方法format格式化的date后：\n"+text);;//2021年08月12日 13时50分35秒
        System.out.println("-----------------------------------------");

        //3.调用SimpleDateFormat对象中的方法parse，按照构造方法中指定的模式，把文本转换为日期对象
        String str = "1998年12月30日 20时00分00秒";
        Date birthday = sdf.parse(str);
//        demo05System.out.println(birthday);//Wed Dec 30 20:00:00 CST 1998
        System.out.println(birthday.toString());//Wed Dec 30 20:00:00 CST 1998
        System.out.println(date.getTime());//获取毫秒值1628748709064
    }
}
