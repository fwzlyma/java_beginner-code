package com.itheima.Exception.demo01.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/*
    throws关键字：异常处理的第一种方式，交给别人处理
    作用：
        当方法内部抛出异常对象的时候，就必须处理这个异常对象
        可以使用throw关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理，自己不处理，给别人处理，最终交给JVM处理--》终端处理
    使用格式：在方法声明时使用
        修饰符 返回值类型 方法名（参数列表） throws {
            throw new AAAException("产生原因")；
            throw new AAAException("产生原因")；
            ...
        }
    注意：
        1.throws关键字必须写在方法声明处
        2.throws关键字后边声明的异常，必须是Exception或者是Exception的子类
        3.方法内部如果抛出类多个异常对象，那么throws后边必须也声明多个异常
            如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
        4.调用了一个声明抛出异常的方法，我们必须得处理声明得异常
            要么throws声明抛出，交给方法的调用者处理，最终交给JVM
            要么try... catch自己处理异常。
*/
public class Demo05Throws {
    /*
        FileNotFoundException extends IOException
        如果抛出的多个异常对象有子父类关系，那么直接声明父类即可。
    */
    public static void main(String[] args) throws FileNotFoundException,IOException {
        readFile("c:\\aa.txt");
        System.out.println("abc");
    }
    /*
        定义一个方法，对传递的文件路径进行合法性判断
        如果路径不是"c:\\a.txt",那么我们就抛出文件找不到异常对象，告知方法的调用者
    */
    public static void readFile(String fileName) throws FileNotFoundException,IOException {
        if (!Objects.equals(fileName, "c:\\a.txt")) {
            throw new FileNotFoundException("传递文件路径不正确！");
        }
    }
}
