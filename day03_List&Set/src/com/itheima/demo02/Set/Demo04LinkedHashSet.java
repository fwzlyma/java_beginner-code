package com.itheima.demo02.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表记录元素的存储顺序，保证元素有序。
*/
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("www");
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("itcast");
        System.out.println(hashSet);//[abc, www, itcast] 无序，不允许重复。

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("www");
        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        linkedHashSet.add("itcase");
        linkedHashSet.add("mn");
        System.out.println(linkedHashSet);//[www, abc, itcase, mn] 有序，不能重复。
    }
}
