package com.itheima.demo01.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写/续写：
        使用两个参数就可以了

    FileOutputStream(File file, boolean append)
          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
    FileOutputStream(String name, boolean append)
          创建一个向具有指定 name 的文件中写入数据的输出文件流。
    参数：
        String name/ File file : 写入的目的地
        boolean append : 追加开关
                true : 追加
                false : 覆盖
    换行：
        windows : \r\n
        linux : /n
        mac:/r
*/
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        //1. 创建FileOutputStream 对象 -- 追加模式
        FileOutputStream fos = new FileOutputStream("day08_IOAndProperties\\src\\com\\itheima\\demo01\\OutputStream\\test.txt",true);
        //2. 写入
        String str = "\r\n你好，JAVA！";
        byte[] b = str.getBytes();
        fos.write(b);
        //3. 关闭
        fos.close();
    }
}
