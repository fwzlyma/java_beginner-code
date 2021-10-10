package com.itheima.demo07Integer;

/*
    基本类型与字符串之间的转换：
    基本类型-->字符串
        1.基本类型值 + "" 最简单的方式（工作中常用）
        2.使用包装类中的静态方法
            static String toString(int i) 返回一个表示指定整数的String对象
        3.使用String类中的静态方法
            static String valueOf(int i) 返回 int 参数的字符串表示形式

    字符串-->基本类型
        使用包装类的静态方法parseXX("字符串")
            Integer类： static int parseInt(String s)
            Double类： static double parseDouble(String s)
*/
public class Demo03Integer {
    public static void main(String[] args) {
        test01();
        System.out.println("-----------------------------------");
        test02();
    }

    private static void test01() {
        //1.基本类型-->字符串
        //1.1最快捷方式：
        String s1 = 123 + "";
        String s2 = "" + 123;
        System.out.println(s1);//123
        System.out.println(s2);//123
        //1.2使用包装类的静态方法
        //包装类Integer
        String s3 = Integer.toString(123456);
        System.out.println(s3);//123456
        //1.3使用String类的静态方法
        String s4 = String.valueOf(3.1415926);
        System.out.println(s4);//3.1415926
    }

    private static void test02() {
        //2.字符串-->基本类型
        //使用包装类：
        String str1 = "123";//int
        String str2 = "1.23";//double
        String str3 = "true";
        int i = Integer.parseInt(str1);
        double j = Double.parseDouble(str2);
        boolean b = Boolean.parseBoolean(str3);
        //Integer包装类的：
        System.out.println(i);
        //Double包装类的：
        System.out.println(j);
        //Boolean包装类的：
        System.out.println(b);
    }
}
