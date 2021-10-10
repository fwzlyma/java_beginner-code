package com.itheima.demo01.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
    java.io.BufferedInputStream extends InputStream
    BufferedInputStream : 字节缓冲输入流
    继承自父类的成员方法：
        int read() 从输入流中读取数据的下一个字节
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b 中
        void close() 关闭输入流并释放与该流关联的所有系统资源
    构造方法：
        BufferedInputStream(InputStream in) 创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
        BufferedInputStream(InputStream in, int size) 创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
        参数：
            InputStream in ： 字节输入流
                传递字节输入流，会给这个字节输入流增加一个缓冲区，提高FileInputStream 的读取效率
            int size : 指定缓冲流内部缓冲区的大小，不指定则默认
    使用步骤（重点）
        1.创建FileInputStream 对象，构造方法中绑定要读取的数据源
        2.创建BufferedInputStream 对象，构造方法中传递FileInputStream 对象，提高FileInputStream 对象的读取效率
        3.使用BufferedInputStream 对象中的方法read，读取文件
        4.释放资源。
*/
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. 创建FileInputStream 对象
        FileInputStream fis = new FileInputStream("day10_IO\\src\\com\\itheima\\demo01\\BufferedStream\\save.txt");
        // 2. 创建BufferedInputStream 对象，构造方法中传递FileInputStream 对象，提高FileInputStream 对象的读取效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        // 3. read()
        try (fis; bis) {
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4. 不适用try ，要将 bis 关闭
        /*bis.close();*/
    }
}
