package com.itheima.demo01.File;

import java.io.File;

/*
    File 类遍历文件夹方法：
        public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
    注意：
        List 和 ListFiles 方法遍历的是构造方法中给出的【目录】
        如果构造方法中给出的目录不存在，抛出空指针异常
        如果构造方法中给出的路径不是一个路径，抛出空指针异常
*/
public class Demo06File {
    public static void main(String[] args) {
        show02();
        /*File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo02\\Recursion");
        System.out.println(f1.mkdirs());*/
    }

    private static void show02() {
        //listFiles
        File f1 = new File("day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    private static void show01() {
        //目录要给对。
        File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
        //目录给错 / 路径没错给文件不给文件夹
        //报错 -- 空指针异常
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }//隐藏文件/文件夹也能遍历到
    }
}
