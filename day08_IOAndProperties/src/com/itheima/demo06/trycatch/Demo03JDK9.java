package com.itheima.demo06.trycatch;

import java.io.*;

/*
    jdk 1.9新特性：
        A a = new A();
        B b = new B();
        try(a,b){
            可能异常代码；
        } catch(异常类变量 变量名){
            异常的处理逻辑;
        }
*/
public class Demo03JDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\wuhaodong\\Pictures\\Saved Pictures\\DoubanPic\\2,霸王别姬 9.6分.jpg");
        File file = new File("C:\\Users\\wuhaodong\\Pictures\\Saved Pictures\\DoubanPic\\2,霸王别姬 9.6分.jpg");
        String name = file.getName();
        String s = name.split(",")[1].split(" ")[0];
        FileOutputStream fos = new FileOutputStream("F:\\projects\\IdeaProjects\\beginner-code\\day08_IOAndProperties\\src\\com\\itheima\\image\\"+s+".jpg");

        try (fis;fos) {
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
