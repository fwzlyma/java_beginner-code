package com.itheima.demo02.Recursion;

public class Demo02Recursion {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }
    /*
        定义一个方法，使用递归计算1-n的和
        1+2+... +n
        必须明确：
            1.递归结束条件
                到1 结束
            2.递归的目的
                获取下一个被加的 数字。
        求和不建议使用递归。
    */
    private static int sum(int i) {
        //结束条件
        if(i==1)return 1;
        //返回值求和 -- 值返回到方法的调用处。
        return i + sum(i - 1);
    }
}
