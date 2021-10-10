package com.itheima.Demo04.Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    使用字节流读取中文文件
    1个中文
        GBK ： 占用两个字节
        UTF-8 : 占用3个字节
*/
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day08_IOAndProperties\\src\\com\\itheima\\Demo04\\Reader\\a.txt");
        FileOutputStream fos = new FileOutputStream("day08_IOAndProperties\\src\\com\\itheima\\Demo04\\Reader\\b.txt");
        int len = 0;
        // UTF-8 对应 3 个字节
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
