package com.itheima.demo06.trycatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
    jdk 1.7新特性：
        try(定义流对象1，定义流对象2，...){
            可能异常的代码；
        }catch(异常类变量 变量名){
            异常的处理逻辑；
        }
*/
public class Demo02JDK7 {
    public static void main(String[] args) {
        try (// 1. 读img
             FileInputStream fis = new FileInputStream("C:\\Users\\wuhaodong\\Pictures\\Saved Pictures\\DoubanPic\\5,美丽人生 9.5分.jpg");
             // 2. 写img
             FileOutputStream fos = new FileOutputStream("F:\\projects\\IdeaProjects\\beginner-code\\day08_IOAndProperties\\src\\com\\itheima\\image\\2.jpg");
        ) {
            int len = 0;
            while((len = fis.read())!= -1){
                System.out.println(len);
                // 写入：
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
