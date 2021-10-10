package com.itheima.demo01.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    一次写多个字节的方法：
        public void write(byte[] b): 将b.length 字节从指定的字节数组写入此输出流
        public void write(byte[] b, int off, int len) : 从指定的字节数组写入 len字节，从偏移量off 开始输出到此输出流。
            参数：
                off: 开始位置
                len：写几个字节。

        如果写的第一个字节是正数 0-127 ，那么显示会先查询ASCII
        如果写的第一个字节是负数，那么第一个字节会和第二个字节，共同组成一个中文显示，查询系统默认表 GBK
*/
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //1. 写入字节、字节数组
        /*show01();*/
        //2. 写入字符串？
        show02();
    }

    private static void show02() throws IOException {
        //1. 创建FileOutputStream 对象
        FileOutputStream fos = new FileOutputStream("day08_IOAndProperties\\src\\com\\itheima\\demo01\\OutputStream\\test.txt");
        //2. 写数据
        String str = "Hello,World!";
        //3. 使用getBytes() 获取字符串对应字节数组
        byte[] bytes = str.getBytes();
        //4. 写入
        fos.write(bytes);
        //5. 关闭流
        fos.close();
    }

    private static void show01() throws IOException {
        //1. 创建FileOutputStream 对象，构造方法放str -- 写入数据的路径
        FileOutputStream fileOutputStream = new FileOutputStream("day08_IOAndProperties\\src\\com\\itheima\\demo01\\OutputStream\\test.txt");
        //2. 调用write 写数据到文件
        /*
            100 对应ASCII码：
                49 48 48  要写入3个字节。
        */
        byte[] b = {49, 48, 48};//100
        byte[] b1 = {65, 66, 67, 68, 69};//ABCDE
        byte[] b2 = {-65, -66, -67, 68, 69};//ABCDE
        fileOutputStream.write(b);
        fileOutputStream.write(b1);
        fileOutputStream.write(b2);
        fileOutputStream.write(b1,2,3);
        /*fileOutputStream.write(49);
        fileOutputStream.write(48);
        fileOutputStream.write(48);*/
        //3.关闭 输出流
        fileOutputStream.close();
    }
}
