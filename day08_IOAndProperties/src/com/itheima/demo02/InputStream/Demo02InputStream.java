package com.itheima.demo02.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
    字节输入流一次读取多个字节的方法：
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b 中
    明确两件事：
        1.方法的参数byte[] 的作用？
            起到缓冲作用，存储每次读取到的多个字节
            数组的长度一把定义为1024(1kb) 或者 1024整数倍
        2.方法的返回值int 是什么？
            每次读取的有效字节个数

    String 类的构造方法
        String(byte[] bytes): 把字节数组转换为字符串
        String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组开始索引 length: 转换的字节个数
*/
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        //1. 创建FileInputStream对象，构造方法绑定要读取的数据源
        FileInputStream fis = new FileInputStream("day08_IOAndProperties\\src\\com\\itheima\\demo01\\OutputStream\\test.txt");
        //2. 使用FileInputStream 对象中的方法read 读取文件
        // int read (byte[] b) 从输入流中读取一定数量的字节，存在b 中
        /*byte[] bytes = new byte[2];
        int len = fis.read(bytes);//读取的有效字节数。
        System.out.println(len);//2
        System.out.println(new String(bytes));//He

        len = fis.read(bytes);
        System.out.println(len);//2
        System.out.println(new String(bytes));//ll

        len = fis.read(bytes);
        System.out.println(len);//1
        System.out.println(new String(bytes));//ol

        len = fis.read(bytes);
        System.out.println(len);//-1
        System.out.println(new String(bytes));//ol*/
        /*
            H E L L O
            H E
                L L
                  L O       byte[0] 走到了 O byte[1] 走到了结束标记!
        */
        //循环优化
        byte[] bytes = new byte[1024];
        int len = fis.read(bytes);
        while (len != -1) {
            System.out.println(len);
            System.out.println(new String(bytes, 0, len));
            len = fis.read(bytes);
        }
        //3. 释放资源
        fis.close();
    }
}
