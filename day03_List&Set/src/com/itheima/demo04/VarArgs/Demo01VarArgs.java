package com.itheima.demo04.VarArgs;

/*
    可变参数：是jdk1.5之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数。
    使用格式：定义方法时使用
        修饰符 返回值类型 方法名(数据类型...变量名){}
    可变参数的原理：
        可变参数的底层就是一个数组，根据传递参数个数不同，会创建不同长单独的数组，来存储这些参数
        传递的参数个数，可以是0个（不传递），1，2，...多个
*/
public class Demo01VarArgs {
    public static void main(String[] args) {
        int i = add(10, 20, 30);
        System.out.println(i);//60

        String res = method("itcast", 5, 5.5, 10, 2, 3, 4, 5, 6, 7, 8, 9, 3, 2, 1);
        System.out.println(res);//itcast55.51023456789321
    }
    /*
        可变参数的注意事项：
            1.某一个方法的参数列表，只能有【一个】可变参数
            2.如果方法的参数有多个，那么可变参数必须写在参数列表的【末尾】
    */
    /*public static void method(int...a,String...b){
    }*/ //错误
    public static String method(String s,int a,Double b,int d,int...arr){
        String result = s;
        result += a + "";
        result += b + "";
        result += d + "";
        for (int i : arr) {
            result += i + "";
        }
        return result;
    }

    //定义一个方法，计算n个int类型整数的和 , n未知。
    /*
        已知：计算整数的和，数据类型已经确定int
        但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数。
    */
    public static int add(int... arr) {
        //定义一个初始化变量，记录累加求和
        int sum = 0;
        //遍历数组
        for (int i : arr) {
            sum += i;
        }
        /*System.out.println(arr);//[I@50cbc42f 底层是一个数组
        System.out.println(arr.length);//3*/
        return sum;
    }

    //【可变参数的终极写法】：
    public static void method1(Object...obj){

    }
}
