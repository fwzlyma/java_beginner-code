package com.itheima.demo01.File;

import java.io.File;
import java.io.IOException;

/*
    public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
    public boolean delete()` ：删除由此File表示的文件或目录。
    public boolean mkdir()` ：创建由此File表示的目录。
    public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。
*/
public class Demo05File {
    public static void main(String[] args) throws IOException {
        show03();
    }
    /*
        public boolean delete()
            删除文件/文件夹
            删了：true
            false：
                文件夹中有内容，不删除
                路径不存在，不删除
        delete 直接删除 文件/文件夹，不走回收站。
    */
    private static void show03() {
        /*File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File\\test.txt");
        System.out.println(f1.delete());//true*/
        /*File f2 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\abc.txt");
        System.out.println(f2.delete());*/
    }

    /*
        public boolean mkdir() : 只能创建单级文件夹
        public boolean mkdirs() : 单级、多级文件夹.
            true
            false
            存在：不创建
            不存在：
                路径给的对：创建
                路径都是胡乱写的：不创建
    */
    private static void show02() {
        //1. 单级文件夹
        /*File f1 = new File("day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File\\MyCreateDirectory");
        System.out.println(f1.mkdirs());*/
        File f1 = new File("day07_FileAndRecursion\\oneDir");
        System.out.println(f1.mkdir());//true
        //2. 多级文件夹
        File f2 = new File("day07_FileAndRecursion\\mulDir\\111\\222\\333\\444");
        System.out.println(f2.mkdir());//false
        System.out.println(f2.mkdirs());//true
        //3. 只能创建文件夹
        File f3 = new File("day07_FileAndRecursion\\abc.txt"); // 类型只能是文件夹
        System.out.println(f3.mkdir());//true
//        new File("day07_FileAndRecursion\\src\\com\\itheima");
        //4. 不存在路径
        File f4 = new File("day07_F\\ccc");
        System.out.println(f4.mkdirs()); // true 不会抛出异常，但是不创建文件夹.
    }

    /*
        public boolean createNewFile()
            true
            false
            只能创建文件
            路径必须存在，在已经存在的路径中创建文件。
    */
    private static void show01() throws IOException {
        //相对路径、绝对路径都可。
        File f1 = new File("day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File\\test.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File\\新建文件夹");
        System.out.println(f2.createNewFile());//true 类型仍然是文件 ， 名字叫文件夹。
    }
}
