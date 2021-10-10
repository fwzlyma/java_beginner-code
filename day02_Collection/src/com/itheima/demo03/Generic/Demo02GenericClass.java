package com.itheima.demo03.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //1.不写泛型默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");

        /*String name = gc.getName();*/
        Object obj = gc.getName();
        System.out.println(obj);
        //2.创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> igc = new GenericClass<>();
        igc.setName(12345);
        Integer name = igc.getName();
        //自动拆箱
        System.out.println(name);
        //3.创建GenericClass对象，泛型使用String类型
        GenericClass<String> sgc = new GenericClass<>();
        sgc.setName("迪丽热巴");
        String name1 = sgc.getName();
        System.out.println(name1);
    }
}
