package com.itheima.demo01.File;

import java.io.File;

/*
    public boolean exists()` ：此File表示的文件或目录是否实际存在。
    public boolean isDirectory()` ：此File表示的是否为目录(文件夹)。
    public boolean isFile()` ：此File表示的是否为文件。
*/
public class Demo04File {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        File f1 = new File("day07_FileAndRecursion\\src");
        File f2 = new File("day07_FileAndRecursion\\src\\a.txt");
        File f3 = new File("a.txt");
        if(f1.exists()){
            /*两个方法互斥。*/
            //2. 判断路径是否是文件夹 -- isDirectory
            System.out.println("f1:"+f1.isDirectory());//true
            //3. 判断路径是否是文件 -- isFile
            System.out.println("f1:"+f1.isFile());//false
        }
        if(f2.exists()){
            System.out.println("f2:"+f2.isDirectory());//false
            System.out.println("f2:"+f2.isFile());//true
        }
        if(f3.exists()){
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());
        }
    }

    private static void show01() {
        //1. 判断是否存在 -- exists
        File f1 = new File("a.txt");
        boolean exists = f1.exists();
        System.out.println(exists);//false

        File f2 = new File("day07_FileAndRecursion\\src\\a.txt");
        boolean exists1 = f2.exists();
        System.out.println(exists1);//true

        File f3 = new File("day07_FileAndRecursion\\src");
        System.out.println(f3.exists());//true
    }
}
