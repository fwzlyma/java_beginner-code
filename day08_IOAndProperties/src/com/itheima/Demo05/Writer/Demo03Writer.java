package com.itheima.Demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法：
        void write(char[] cbuf) `写入字符数组。
        abstract  void write(char[] cbuf, int off, int len) `写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        void write(String str) `写入字符串。
        void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
*/
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\projects\\IdeaProjects\\beginner-code\\day08_IOAndProperties\\src\\com\\itheima\\Demo05\\Writer\\a.txt");
        // 1. 写字符数组
        /*char[] cs = {'a', 'b', 'c', 'd', 'e'};
        fw.write(cs);
        fw.close();*/
        // 2. 写字符数组一部分
        /*char[] cs = {'a', 'b', 'c', 'd', 'e'};
        fw.write(cs,0,3);
        fw.close();*/
        // 3. 写字符串
        /*fw.write("传智播客");
        fw.close();*/
        // 4. 写字符串的一部分
        fw.write("黑马程序员",0,2);
        fw.close();
    }
}
