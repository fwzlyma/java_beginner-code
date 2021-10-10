package com.itheima.demo02.Recursion;

import java.io.File;

/*
    练习：
        递归打印多级目录
    需求：
        遍历文件夹，及文件夹的子文件夹
        打印全部文件夹内容
*/
public class Demo04Recursion {
    public static void main(String[] args) {
        /*File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }*/
        /*File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }*/
        File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
        printDir(f1);
    }
    /*
        定义一个方法，参数传递File 类型的目录
            方法中对目录进行遍历
    */
    private static void printDir(File file) {
        //结束条件
        if(file.isFile())return;
        //要递归打印的东西。
        for (File f : file.listFiles()) {
            System.out.println(f);
            printDir(f);
        }
    }
}
