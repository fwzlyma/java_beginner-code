package com.itheima.demo02.ReverseStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter : 是字符流通向字节流的桥梁，可使用指定的charset 将要写入流中字符编码成字节。--能看懂的变成看不懂的
    继承自父类的共性成员方法：
        void write(int c) 写入单个字节
        void write(char[] cbuf) 写入字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，off数组的索引开始，len写的字符个数。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分，off字符串的开始索引，len写的字符个数。
        void flush() 刷新该流的缓冲。
        void close() 关闭该流，但要先刷新它。
    构造方法：
        OutputStreamWriter(OutputStream out) 创建使用默认字符编码的 OutputStreamWriter。
        OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的 OutputStreamWriter。
        参数：
            OutputStream out : 字节输出流，可以用来写转换之后的字节到文件中。
            String charsetName : 指定的码表名称，不区分大小写，可以是utf-8/UTF-8 gbk/GBK ... 不指定默认使用UTF-8
    使用步骤：
        1.创建OutputStreamWriter 对象，构造方法中传递字节输出流和指定的码表名称
        2.使用OutputStreamWriter 对象中的方法write ,把字符转换为字节 存储缓冲区中--编码
        3.使用OutputStreamWriter 对象中的方法flush, 把内存缓冲区中的字节刷新到文件中--使用字节流写字节的过程
        4.释放资源
*/
// 由于FileWriter FileReader 只能查询当前默认的码表，可能会出现乱码的情况。
// 因此使用OutputStreamWriter InputStreamReader
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        // 1. 创建FileOutputStream 对象
        FileOutputStream fos = new FileOutputStream("day10_IO\\src\\com\\itheima\\demo02\\ReverseStream\\write_gbk.txt");
        // 2. 创建OutputStreamWriter 对象，传递FileOutputStream 对象，设置编码格式
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        // write : 字符转换为字节写入到文件中
        osw.write("黑马程序员");
        osw.flush();
        osw.close();
    }
}
