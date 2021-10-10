package com.itheima.demo01.BufferedStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.BufferedReader extends Reader
    继承自父类的共性成员方法：
        int read() 读取单个字符并返回。
        int read(char[] cbuf) 一次读取多个字符，将字符读入数组。
        void close() 关闭该流并释放与之关联的所有资源。

    构造方法：
        BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
        BufferedReader(Reader in, int sz) 创建一个使用指定大小输入缓冲区的缓冲字符输入流。
        参数：
            Reader in : 字符输入流
                可以传递FileReader，缓冲流会给FileReader 增加一个缓冲区，提高FileReader 的读取效率。
    特有的成员方法：
        String readLine() 读取一个文本行。读取一行数据
            终止符： \r   \n
        返回值：
            包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回null
    使用步骤：
        1.创建字符缓冲输入流对象，构造方法传递字符输入流
        2.使用字符缓冲输入流对象中的方法read/readLine 读取文本
        3.释放资源
*/
public class Demo04BufferedReader {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. 创建字符缓冲输入流对象，内部传递匿名内部类字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("day10_IO\\src\\com\\itheima\\demo01\\BufferedStream\\save.txt"));
        // 2. read
        try (br) {
            /*int len = 0;
            char[] chars = new char[1024];
            while ((len = br.read(chars)) != -1) {
                System.out.println(chars);
            }*/
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*br.close();*/
    }
}
