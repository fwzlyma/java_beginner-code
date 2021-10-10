package com.itheima.demo02.Recursion;
/*
    递归**：指在当前方法内调用自己的这种现象。

    递归的分类:**
    递归分为两种，直接递归和间接递归。
    直接递归称为方法自身调用自己。
    间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法。

    注意事项**：
    递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
    在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
    构造方法,禁止递归

    递归使用前提：
        调用方法时，方法的主体不变，每次调用方法的参数不同，可以使用递归。
*/
public class Demo01Recursion {
    public static void main(String[] args) {
        a(10);
    }

    private static void a(int i) {
        if(i>0){
            a(i-1);//java.lang.StackOverflowError
            System.out.println("a方法"+i);
        }else return;//结束方法
    }
}
