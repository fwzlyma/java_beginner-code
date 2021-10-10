package com.itheima.demo03.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符：
        ？：代表任意的数据类型
    使用方式：
        不能创建对象使用
        只能作为方法的参数使用。
*/
//使用？作为参数代替具体的参数
//public static void printArray(ArrayList<?> list)
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");
        printArray(list01);
        printArray(list02);
    }
    /*
        定义一个方法，能遍历所有类型的ArrayList集合
        这时我们不知道ArrayList集合使用什么类型的数据，可以泛型的通配符？来接收数据类型
        注意：
            泛型是没有继承概念的。
            ArrayList<Object>
                ArrayList<Integer> ->报错
                ArrayList<String>  ->报错
    */
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
