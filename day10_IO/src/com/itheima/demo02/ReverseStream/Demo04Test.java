package com.itheima.demo02.ReverseStream;

import java.io.*;

/*
    练习：转换文件编码
        将GBK 编码的文本文件，转换为UTF-8 编码的文本文件
    分析：
        1.创建InputStreamReader 对象，构造方法中传递字节输入流和指定的编码表名称GBK
*/
public class Demo04Test {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // 1. 解码 -- 读
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO\\src\\com\\itheima\\demo02\\ReverseStream\\gbk.txt"),"GBK");
        // 2. 编码 -- 写
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_IO\\src\\com\\itheima\\demo02\\ReverseStream\\write_utf-8.txt"),"UTF-8");
        try(isr;osw) {
            int len =0;
            char[] chars = new char[1024];
            while ((len = isr.read(chars)) != -1) {
                osw.write(new String(chars,0,len));
            }
            osw.write("\r\n");
            osw.write("这是gbk -> utf-8的练习！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
