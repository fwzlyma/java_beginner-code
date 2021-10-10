package com.itheima.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream : 字节输入流
    此抽象类是表示字节输入流的所有类的超类

    定义了所有子类的共性方法：
        int read()从此输入流中读取一个数据字节。
        int read(byte[] b)从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
        void close() 关闭输入流，释放资源

    java.io.FileInputStream extends InputStream
    FileInputStream : 文件字节输入流
    作用： 把硬盘文件中的数据，读取到内存中使用

    构造方法：
        FileInputStream(File file)通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
        FileInputStream(String name)通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
            参数：
                String name / File file : 读取文件的路径
            构造方法的作用：
                1.会创建一个FileInputStream 对象
                2.会把FileInputStream 对象指定构造方法中要读取的文件。

    读取数据的原理 硬盘 -> 内存
        java程序 -> JVM -> OS -> OS调用读取数据方法 -> 读取文件

    字节输入流的使用步骤【重点】
        1.创建FileInputStream 对象，构造方法中绑定读取的数据源
        2.使用 read 方法，读文件
        3.释放资源
*/
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1. 创建FileInputStream 对象
        FileInputStream fis = new FileInputStream("day08_IOAndProperties\\src\\com\\itheima\\demo01\\OutputStream\\test.txt");
        //2. read
        /*int read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);*/
        /*
            不知道文件中多少字节，使用while
            读取到 -1 结束
        */
        int read = fis.read();
        while(read!=-1){
            System.out.print((char) read);
            read = fis.read();
        }
        System.out.println(fis.read());//-1 -- 结束标志
        //3. 释放资源
        fis.close();
    }
}
