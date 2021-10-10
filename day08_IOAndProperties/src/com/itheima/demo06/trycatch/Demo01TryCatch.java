package com.itheima.demo06.trycatch;

import java.io.FileWriter;
import java.io.IOException;

/*
    在jdk 1.7之前使用try catch finally 处理流中的一次
    格式：
        try {
            可能异常的代码
        } catch (异常类变量 变量名) {
            异常处理逻辑
        }finally {
            一定执行的代码
            资源释放
        }
*/
public class Demo01TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("day08_IOAndProperties\\src\\com\\itheima\\Demo05\\Writer\\a.txt", true);
            fw.write("\r\n追加的内容！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
