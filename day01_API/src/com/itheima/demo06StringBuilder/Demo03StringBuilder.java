package com.itheima.demo06StringBuilder;

/*
    StringBuilder和String可以相互转换:
        String -> StringBuilder ：可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
        StringBuilder -> String : 可以使用StringBuilder的对象 *
            *.toString()方法转换成字符串。
*/
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //1.将String 转换为StringBuilder
        StringBuilder sb = new StringBuilder("abc");
        //查看一下
        System.out.println(sb);
        //2.将StringBuilder转换为String
        //添加字符串至StringBuilder对象中
        sb.append("efg");
        String str = sb.toString();
        //查看一下
        System.out.println(str);

    }
}
