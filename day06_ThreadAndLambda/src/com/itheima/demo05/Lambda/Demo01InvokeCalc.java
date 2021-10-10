package com.itheima.demo05.Lambda;

/*
    Lambda 表达式有参数有返回值的练习
    需求：
        给定一个计算器Calculator 接口，内含抽象方法calc 可以将两个int 数字相加得到和值
        使用Lambda 的标准格式调用invokeCalc 方法，完成120 和130 的相加计算。
*/
public class Demo01InvokeCalc {
    public static void main(String[] args) {
        //Lambda 表达式处理匿名内部类。
        invokeCalc(120, 130, (a, b) -> {
            return a + b;
        });
        /*invokeCalc(130, 120, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });*/
        //简化Lambda 表达式 一行代码 -- 删 return {} ;
        invokeCalc(120, 130, (a, b) -> a + b);
    }

    /*
        定义一个方法
        参数传递两个int 类型
        一个Calculator 接口
        方法内部调用Calculator 中的方法calc 计算两个整数的和。
    */
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
