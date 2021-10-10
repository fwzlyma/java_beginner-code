package com.itheima.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;

/*
    java.util.Set接口 extends Collection 接口
    Set接口的特点：
        1.不允许存储重复元素
        2.没有索引，没有带索引的方法，也不能使用普通for循环遍历

    java.util.HashSet集合 implements Set 接口
    HashSet特点：
        1.不允许存储重复的元素
        2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
        3.是一个无序的集合，存储元素和取出元素的顺序有可能不一致
        4.底层是一个哈希表结构（查询的速度非常的快）
*/
public class Demo01Set {
    public static void main(String[] args) {
        //1.创建HashSet -- 类型Integer
        HashSet<Integer> integerHashSet = new HashSet<>();
        //2.使用add方法往集合中添加元素
        integerHashSet.add(1);
        integerHashSet.add(9);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(3);
        integerHashSet.add(3);
        //3.遍历 -- 不能使用普通for循环
        //使用迭代器获取:
        //3.1 隐藏迭代器 -- 增强for循环
        for (Integer integer : integerHashSet) {
            System.out.println(integer);
        }
        System.out.println("=========================");
        //3.2 迭代器
        Iterator<Integer> it = integerHashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
