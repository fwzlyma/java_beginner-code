package com.itheima2;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        MyClass<Object> om = new MyClass<>();
        //1.使用泛型的好处：
        om.print("3.1415926");
        om.print(Math.PI);
        System.out.println("===========================");
        //2.缺陷：--需要向下转型
        //无法使用String 方法
        //如：
        ArrayList<Object> obj = new ArrayList<>();
        obj.add("凤凰传奇");
        obj.add("最炫民族风");
        obj.add("江南");
        //str.length可以用于给出str的长度
        for (Object o : obj) {
            /*System.out.println(o.length);*///报错！
            //怎么办？
            //向下转型
            String obj_str = (String) o;
            System.out.println(o);
            System.out.println(obj_str.length());
        }
        System.out.println("========================");
        MyInterfaceImpl<Object> objectMyInterface = new MyInterfaceImpl<>();
        objectMyInterface.print(3.14);
        objectMyInterface.print(3);
        objectMyInterface.print(true);
        objectMyInterface.print('A');
        objectMyInterface.print("abc");
    }
}
