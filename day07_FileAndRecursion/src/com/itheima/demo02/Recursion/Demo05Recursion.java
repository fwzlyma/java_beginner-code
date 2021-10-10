package com.itheima.demo02.Recursion;

import java.io.File;

/*
    练习：
        遍历一个目录
        打印所有 .java 文件。
*/
public class Demo05Recursion {
    public static void main(String[] args) {
        File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
        printJavaFile(f1);
    }

    public static void printJavaFile(File file) {
        if(file.isFile())return;
        for (File f : file.listFiles()) {
            //判断 -- 是文件、文件结尾是.java
            //大小写忽略了。。
            if(f.isFile() && f.getName().toLowerCase().endsWith(".java")){
                System.out.println(f);
            }
            printJavaFile(f);
        }
    }
}
