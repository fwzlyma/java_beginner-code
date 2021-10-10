package com.itheima.Exception.demo03.Exception;

import java.util.List;

/*
    异常的注意事项
*/
public class Demo01Exception {
    public static void main(String[] args) {
        /*
            多个异常使用捕获又如何处理？
            1.多个异常分别处理。
            2.多个异常一次捕获，多次处理
            3.多个异常一次捕获一次处理
        */
        try{
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (Exception e){
            System.out.println(e);
        }/*catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/
//        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3


//        System.out.println(list.get(3));//IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        System.out.println("结束...");
    }
    /*
        【方法1】
            使用多个try... catch
        【方法2】
            使用一个try... catch... catch...多个catch
            注意：
                catch里边定义的异常变量，如果有子父类关系，那么子类的异常遍历必须写在上边，否则会报错。
        【方法3】
            使用一个try... catch 直接抛出全部异常
        运行时异常可以不处理，直接给JVM处理，让它终止程序。
    */
}
