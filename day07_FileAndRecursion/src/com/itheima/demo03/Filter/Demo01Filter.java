package com.itheima.demo03.Filter;

import java.io.File;

/*
    需求：
        遍历目录所有文件 文件夹
        找到所有.java 文件
    【方法2】
        使用过滤器实现。
        在File 类中有两个和 listFiles 重载的方法，方法的参数传递就是过滤器。
   ### 【1】 public File[] listFiles(FileFilter filter) :
        返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
        java.io.FileFilter 接口：用于抽象路径名（File对象） 的过滤器。
            作用：用来过滤文件（File 对象）
            抽象方法：用来过滤文件的方法
                boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
                    true : 存到listFiles() 对应的数组里面
                    false : 不存到数组里面

   ### 【2】 public File[] listFiles(FilenameFilter filter) :
        返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
        java.io 接口 FilenameFilter： 实现此接口的类实例可用于过滤文件名。
            作用：过滤文件名称
            抽象方法：
                boolean accept(File dir,String name)测试指定文件是否应该包含在某一文件列表中。
                参数：
                    File dir : 被遍历的目录
                    String name : 使用ListFiles 遍历目录，获取到的每一个文件、文件夹名称。
        注意：
            两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则。
*/
public class Demo01Filter {
    public static void main(String[] args) {
        File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\com\\itheima\\demo01\\File");
        printJavaFile(f1);
    }

    public static void printJavaFile(File file) {
        //如果是文件，递归结束
        if(file.isFile())return;
        //使用listFiles 找到文件、文件夹。 FileFilter 是一个接口需要实现并重写抽象方法 ，除非用匿名内部类
        for (File f : file.listFiles(new FileFilterImpl())) {
            //判断 -- 是文件、文件结尾是.java
            //大小写忽略了。。
            System.out.println(f);
            /*if(f.isFile() && f.getName().toLowerCase().endsWith(".java")){
                System.out.println(f);
            }*/
            //递归进层。
            printJavaFile(f);
        }
    }
}
