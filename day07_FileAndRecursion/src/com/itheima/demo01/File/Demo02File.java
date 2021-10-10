package com.itheima.demo01.File;

import java.io.File;

/*
    路径：
        绝对路径： 完整
            以盘符开始 C: D: ...
        相对路径： 简化
            相对于当前项目根目录
            如果使用当前项目的根目录，路径可以简化。
        F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File\\Demo01File.java
        简化beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File\\Demo01File.java
    注意：
        1.路径不分大小写
        2.路径中文件名称分隔符windows 使用两个\\ 因为第一个是转义字符。
*/
public class Demo02File {
    public static void main(String[] args) {
        //File 类构造方法
//        show02("F:\\","IdeaProjects");
        show03();
    }
    /*
        File(File parent, String child)根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        参数：把路径分成了两部分
            File parent : 父路径
            String child : 子路径
        好处：
            父路径和子路径，可以单独书写，使用灵活，父路径、子路径都可以改变。
            父路径是File 类型，可以使用File 的方法对路径进行一些操作，再使用路径创建对象。
    */
    private static void show03() {
        File parent = new File("C:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file);
    }

    /*
        File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
        参数：把路径分成了两部分
            String parent : 父路径
            String child : 子路径
        好处：
            父路径和子路径，可以单独书写，使用起来非常灵活；
            父路径和子路径都可以变化。
    */
    private static void show02(String parent,String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /*
        File(String pathname)通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        参数：
            String pathname : 路径名
            路径可以是以文件结尾，也可以文件夹结尾
            路径可以相对，可以绝对路径
            路径不判断是否存在，可真可假。只封装。
    */
    private static void show01() {
        File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion");
        System.out.println(f1);//重写了Object类的toString方法，打印路径字符串。

        File f2 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File\\Demo01File.java");
        System.out.println(f2);

        File f3 = new File("a.txt");
        System.out.println(f3);//假的也行  a.txt
    }
}
