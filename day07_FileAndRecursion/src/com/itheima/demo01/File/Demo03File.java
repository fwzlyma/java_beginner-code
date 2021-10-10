package com.itheima.demo01.File;

import java.io.File;

/*
     public String getAbsolutePath()  ：返回此File的绝对路径名字符串。
     public String getPath()  ：将此File转换为路径名字符串。
     public String getName()  ：返回由此File表示的文件或目录的名称。
     public long length()  ：返回由此File表示的文件的长度。
 */
public class Demo03File {
    public static void main(String[] args) {
        show04();
    }
    /*
        public long length()  ：返回由此File表示的文件的长度。
        获取的是构造方法指定的文件的大小，以字节为单位。
        注意：
            文件夹是没有大小概念的，不能获取文件夹的大小
            如果构造方法给出的路径不存在，那么length 方法返回0
    */
    private static void show04() {
        File file = new File("day07_FileAndRecursion\\src\\a.txt");
//        System.out.println(file.getAbsolutePath());
        long length = file.length();
        System.out.println(length);//74字节

        File f2 = new File("a.txt");//不存在
        System.out.println(f2.length());//0 -- 代表文件不存在。

        File f3 = new File("day07_FileAndRecursion\\src");
        System.out.println(f3.length());//0 -- 文件夹是没有大小的。
    }

    /*
        public String getName()  ：返回由此File表示的文件或目录的名称。
        获取的就是构造方法传递路径的结尾部分。--文件或文件夹
    */
    private static void show03() {
        File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);//a.txt

        File f2 = new File("F:\\projects\\IdeaProjects");
        String name2 = f2.getName();
        System.out.println(name2);
    }

    /*
        public String getPath()  ：将此File转换为路径名字符串。
            是什么路径输出什么路径。
        toString 方法调用的就是 getPath() 方法
            源码：
                public String toString() {
                    return getPath();
                }
    */
    private static void show02() {
        File f1 = new File("F:\\projects\\IdeaProjects\\beginner-code\\day07_FileAndRecursion\\src\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);
        System.out.println(path2);

        System.out.println(f1);//F:\projects\IdeaProjects\beginner-code\day07_FileAndRecursion\src\a.txt
        /*f1.toString() 调用的就是 File 类的 getPath() 方法*/
        System.out.println(f1.toString());//F:\projects\IdeaProjects\beginner-code\day07_FileAndRecursion\src\a.txt
    }

    /*
        public String getAbsolutePath() ：
            返回此File的绝对路径名字符串。
            真实路径：打印完整绝对路径
            假的路径：打印路径原样。
    */
    private static void show01() {
        File path = new File("F:\\","a.txt");
        System.out.println(path.getAbsolutePath());//F:\a.txt

        File file = new File("day07_FileAndRecursion\\src\\a.txt");
        System.out.println(file.getAbsolutePath());//F:\projects\IdeaProjects\beginner-code\day07_FileAndRecursion\src\a.txt
    }

}
