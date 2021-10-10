package com.itheima.demo04.JDK9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    JDK 9 的新特性：
        List接口，Set接口，Map接口：
            增加了一个静态的方法of，可以一次性给集合添加多个元素
        static <E> List<E> of (E... elements)
        使用前提：
            当集合中存储的元素的个数已经确定了，不再改变时使用
    注意：
        1.of方法只适用于 List , Set , Map 接口，不适用于接口的实现类
        2.of方法的返回值是一个不能改变的集合，集合不能使用add，put方法添加元素，会抛出异常
        3.Set接口和Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常。
    用了of ：不能添加、不能删除、不能重复。
*/
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e");
        System.out.println(list);//[a, b, c, d, e]
//        list.add("w");//UnsupportedOperationException
//        list.remove("e");
//        System.out.println(list);//UnsupportedOperationException

//        Set<String> set = Set.of("a", "b", "c", "a");//IllegalArgumentException: duplicate element: a
        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set);

        Map<String, Integer> map = Map.of("张三", 18, "李四", 20);
        System.out.println(map);
    }
}
