package com.itheima.demo02.ReverseStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    FileReader 可以读取默认编码格式 - utf-8 的文件。
    FileReader 读取系统默认编码 - 中文gbk 产生乱码.
*/
public class Demo01FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("day10_IO\\src\\com\\itheima\\demo02\\ReverseStream\\gbk.txt");
        FileReader fr2 = new FileReader("day10_IO\\src\\com\\itheima\\demo02\\ReverseStream\\utf-8.txt");
        try (fr; fr2) {
            int len = 0;
            char[] chars = new char[1024];
            while ((len = fr.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
            while ((len = fr2.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
