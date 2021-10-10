package com.itheima.Demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    flush 方法和close 方法的区别
        -flush：刷新缓冲区，流对象可以继续使用
        -close：先刷新缓冲区，然后释放资源，流对象不能继续使用.
*/
public class Demo02FlushAndClose {
    public static void main(String[] args) throws IOException {
        // 1. 创建FileWriter
        FileWriter fw = new FileWriter("F:\\projects\\IdeaProjects\\beginner-code\\day08_IOAndProperties\\src\\com\\itheima\\Demo05\\Writer\\a.txt");
        // 2. 调用FileWriter对象中的方法write,把数据写入到内存缓冲区
        fw.write(97);
        // 3. flush刷新
        fw.flush();
        //继续使用
        fw.write(98);
        fw.flush();
        // 4. 释放资源
        fw.close();
    }
}
