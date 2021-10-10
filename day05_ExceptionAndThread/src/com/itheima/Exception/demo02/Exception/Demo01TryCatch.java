package com.itheima.Exception.demo02.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/*
    try... catch : 异常处理的第二种方式
    格式：
        try{
            可能产生异常的代码；
        }catch(定义一个异常的遍历，用来接收try中抛出的异常对象){
            异常的处理逻辑，异常对象之后，怎么处理异常对象
            一般会把异常的信息记录到一个日志中。
        }
        ...
        catch(异常类名 变量名){

        }
    注意：
        1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行之后的代码
            如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完try中的代码，继续执行try... catch之后的代码.
*/
public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.txtt");
            System.out.println("资源释放");
        } catch (IOException e) {
            //更改了这一块就没有JVM处理异常的打印信息了。
//            System.out.println("传递的文件后缀名不对。");
            /*
                Throwable类中定义了3个异常处理的办法
                 String getMessage() 返回此 throwable 的简短描述。
                 String toString() 返回此 throwable 的详细消息字符串
                 void printStackTrace() JVM打印异常，默认此方法，异常信息是最全面的。
            */
//            System.out.println(e.getMessage());//文件后缀名不对！
//            System.out.println(e.toString());//java.io.FileNotFoundException: 文件后缀名不对！
            e.printStackTrace();
        }
        System.out.println("abc");
    }
    /*
        路径名不对抛出IO异常对象。
    */
    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new FileNotFoundException("文件后缀名不对！");
        }else {
            System.out.println("路径没有问题，读取文件");
        }

    }
}
