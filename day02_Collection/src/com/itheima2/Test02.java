package com.itheima2;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java.");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        //两个不同包装类的集合，想要遍历，两个方法？？？
        //不能一个方法遍历两个类型的集合？
        //是有list.for可以遍历list集合，但是集合参数确定能传递进去？？
        /*demo01(list);*/
        //1.private static void demo01(ArrayList<Object> list):报错！
        //2.private static void demo01(ArrayList<String/Integer> list):更错！
        //用 ? -- 从方法上解决问题。也可以从定义上解决问题。
        demo01(list);
        demo01(list2);
    }

    private static void demo01(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
