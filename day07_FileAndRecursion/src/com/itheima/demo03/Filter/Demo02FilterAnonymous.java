package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02FilterAnonymous {
    public static void main(String[] args) {
        File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
//        anonymousPrintJavaFiles(f1);
        /*File[] files = f1.listFiles((File dir, String name)-> name.toLowerCase().endsWith(".java"));
        for (File file : files) {
            System.out.println(file);
        }*/
        printUseFilenameFilter(f1);

        /*for (File file : f1.listFiles((dir,name)->{
            System.out.println(dir.getAbsolutePath()+"\\"+name);
            return true;
        })) {
            System.out.println("=====================");
        }*/
    }

    public static void anonymousPrintJavaFiles(File file) {
        if (file.isFile()) return;
        //这里在 listFiles() 里面定义一个匿名内部类 ,并且我使用Lambda 表达式改进 一行代码，可省略 {} return ;
        for (File f : file.listFiles((pathname) -> pathname.getName().toLowerCase().endsWith(".java"))){
            System.out.println(f);
            anonymousPrintJavaFiles(f);
        }
    }

    public static void printUseFilenameFilter(File file) {
        //是文件，遍历返回 -- 不进层。
        if(file.isFile())return;
        //遍历 listFiles -- 当前目录下的 文件、文件夹 ，返回的是一个File 类型的数组
        //并且我设置一个使用FilenameFilter 的过滤器,然后改成Lambda 表达式 -- 帅
        for (File f : file.listFiles((dir, name)-> name.toLowerCase().endsWith(".java"))) {
            System.out.println(f);
            printUseFilenameFilter(f);
        }
    }
}
