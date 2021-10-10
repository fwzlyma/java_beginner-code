package com.itheima.demo01.BufferedStream;

import java.io.*;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream : 字节缓冲输出流

    继承自父类的共性成员方法：
        void close() 关闭此输出流并释放与此流有关的所有系统资源。
        void flush() 刷新此输出流，并强制将所有已缓冲的输出字节写入该流中。
        void write(byte[] b) 将 b.length 个字节写入此输出流。
        void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
        void write(int b) 将指定 byte 写入此输出流。
    构造方法：
        BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
        BufferedOutputStream(OutputStream out, int size) 创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。
        参数：
            OutputStream out : 字节输出流
                可以传递FileOutputStream, 缓冲流给FileOutputStream 增加一个缓冲区，提高FileOutputStream 写入效率
            int size : 指定缓冲流内部缓冲区的大小，不指定就默认
    使用步骤：
        1.创建FileOutputStream 对象，构造方法绑定要输出的目的地
        2.创建BufferedOutputStream 对象，构造方法中传递FileOutputStream 对象，提高FileOutputStream 对象效率
        3.使用BufferedOutputStream 对象中的方法write ，把数据写入到内部缓冲区中
        4.使用BufferedOutputStream 对象中的方法flush , 把内部缓冲区的数据，刷新到文件中
        5.释放资源（默认调用flush）
*/
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. 定义字节输入输出流
        /*缓冲流负责 缓冲区 ， 提高程序效率*/
        FileInputStream fis = new FileInputStream("C:\\Users\\wuhaodong\\Pictures\\Saved Pictures\\DoubanPic\\11,海上钢琴师 9.3分.jpg");
        FileOutputStream fos = new FileOutputStream("F:\\projects\\IdeaProjects\\beginner-code\\day10_IO\\src\\com\\itheima\\demo01\\BufferedStream\\1.jpg");
        // 2. 定义缓冲流
        BufferedInputStream bis = new BufferedInputStream(fis,1024);
        BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
        try (fis;fos;bis;bos) {
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
