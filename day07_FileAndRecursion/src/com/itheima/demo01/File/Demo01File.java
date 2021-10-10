package com.itheima.demo01.File;

import java.io.File;

/*
    java.io.File 类
    文件和目录路径名的抽象表示形式
    java把电脑中的文件和文件夹（目录）封装成为一个File 类，我们可以使用File 类对文件和文件夹进行操作
    我们可以使用File 类的方法
        创建文件、文件夹
        删除
        获取
        判断是否存在
        对文件夹进行遍历
        获取文件大小
    File 类是一个与系统无关的类，任何操作系统都可以使用这个类中的方法
    【重点】
        三个单词：
            file ： 文件
            directory ： 文件夹/目录
            path ： 路径
*/
public class Demo01File {
    public static void main(String[] args) {
        /*
            static String pathSeparator与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
            static char pathSeparatorChar 与系统有关的路径分隔符。

            static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
            static char separatorChar 与系统有关的默认名称分隔符。

            以后操作路径：路径不能写死了
            C:\develop\a\a.txt  windows 对  linux 错。
            C:/develop/a/a.txt
            各个字段 + File.separator. --  / \
        */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符  windows ;  linux : 不同

        String separator = File.separator;
        System.out.println(separator);// \ 文件名称分隔符  windows \  linux /
    }
}
