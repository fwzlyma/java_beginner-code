package com.itheima.demo02.Recursion;
/*
    练习：
        计算阶乘。
*/
public class Demo03Recursion {
    public static void main(String[] args) {
        long jc = jiecheng(5);
        System.out.println("阶乘结果:"+jc);
    }

    private static long jiecheng(int i) {
        //结束条件
        if(i == 2)return 2;
        //返回结果值。
        return i * jiecheng(i - 1);
    }
}
