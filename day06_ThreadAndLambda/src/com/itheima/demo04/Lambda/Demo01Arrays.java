package com.itheima.demo04.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Lambda表达式有参数有返回值的练习
    需求：
        使用数组存储多个Person对象
        对数组中的Person 对象使用Arrays的sort 方法通过年龄进行升序排序
*/
public class Demo01Arrays {
    public static void main(String[] args) {
        //1.创建Person对象、使用数组存放
        Person[] arr = {
            new Person("迪丽热巴", 20),
            new Person("古力娜扎", 18),
            new Person("杨幂", 23),
        };
        //2.升序排序
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Person person : arr) {
            System.out.println(person);
        }*/

        //3.使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr,((o1, o2) -> {
            return o1.getAge() - o2.getAge();
        }));
        for (Person person : arr) {
            System.out.println(person);
        }
        System.out.println("---------------------");
        //简化Lambda 【只一行代码】 -- 省略 {} return ;
        Arrays.sort(arr, (o1,o2)-> o2.getAge() - o1.getAge());
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
