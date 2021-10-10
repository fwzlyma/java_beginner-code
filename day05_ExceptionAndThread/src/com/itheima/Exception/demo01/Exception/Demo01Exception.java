package com.itheima.Exception.demo01.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类是 Java 语言中所有错误或异常的超类
        Exception:编译期异常，进行编译（写代码）java程序出现的问题
            RuntimeException:运行期异常，java程序过程中出现的问题。
            异常就相当于程序得了一个小毛病，把异常处理掉，程序就可以继续运行。
        Error：错误
            就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行。
*/
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        //Exception:编译期异常，进行编译（写代码）java程序出现的问题
        //1.定义格式化对象sdf
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.新建一个date对象
        Date date = new Date();
        //3.将date对象format为对应格式的字符串
        String time = sdf.format(date);
        //4.将对应格式的字符串parse为date对象
        Date date2 = null;
        /*使用try catch可以不中断程序执行完，然后打印异常*/
        try {
            date2 = sdf.parse("2021-08-19 12:48:47");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(time);
        System.out.println(date2);
    }
}
