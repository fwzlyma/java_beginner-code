package com.itheima.Demo04.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
    java.io.Reader：字符输入流，是字符输入流的最顶层的父类，定义了一些共性的成员方法，是一个抽象类
    共性的成员方法：
        int read() 读取单个字符并返回。
        int read(char[] cbuf) 一次读取多个字符，将字符读入数组。
        void close() 关闭该流并释放与之关联的所有资源。

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader : 文件字符输入流
    作用：把硬盘文件中的数据以字符的方式读取到内存中

    构造方法：
        FileReader(String fileName)
        FileReader(File file)
        参数：读取文件的数据源
            String fileName: 文件的路径
            File file: 一个文件
        FileReader构造方法的作用：
            1.创建一个FileReader 对象
            2.会把FileReader 对象指向要读取的文件
    字符输入流的使用步骤：
        1.创建FileReader 对象，构造方法中绑定要读取的数据源
        2.使用FileReader 对象中的方法read 读取文件
        3.释放资源
*/
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        // 1. 创建字符流读取对象
        FileReader fr = new FileReader("F:\\projects\\IdeaProjects\\beginner-code\\day08_IOAndProperties\\src\\com\\itheima\\Demo04\\Reader\\a.txt");
        /*// 2. 使用read 读取单个字符并返回
        int len = 0;// 表示单个字符
        while ((len = fr.read()) != -1) {
            System.out.println((char)len);
        }*/
        // 2. 使用read 读入字符数组
        char[] cs = new char[1024];
        int len = 0;
        while ((len = fr.read(cs)) != -1) {
            /*
                String 类的构造方法
                String(char[] value) 把字符数组转换为字符串
                String(char[] value, int offset, int count) 把字符数组的一部分转换为字符串
            */
            System.out.println(new String(cs, 0, len));
        }
        // 3. 释放资源
        fr.close();
    }
}
