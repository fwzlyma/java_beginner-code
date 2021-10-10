package com.itheima.demo01.List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List 接口
    LinkedList集合的特点：
        1.底层是一个链表结构：查询慢、增删快
            查询：要从头或尾开始挨个找??
            增删：不需要创建新的集合，直接在原集合上操作。
        2.里边包含了大量操作首尾元素的方法
        注意：使用LinkedList集合特有的方法，【不能使用多态】
            * public void addFirst(E e):将指定元素插入此列表的开头。
            * public void addLast(E e):将指定元素添加到此列表的结尾。
            * public E getFirst():返回此列表的第一个元素。
            * public E getLast():返回此列表的最后一个元素。
            * public E removeFirst():移除并返回此列表的第一个元素。
            * public E removeLast():移除并返回此列表的最后一个元素。
            * public E pop():从此列表所表示的堆栈处弹出一个元素。
            * public void push(E e):将元素推入此列表所表示的堆栈。
            * public boolean isEmpty()：如果列表不包含元素，则返回true。
*/
public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
//        show02();
//        show03();
    }

    /*
        * public E removeFirst():移除并返回此列表的第一个元素。
        * public E removeLast():移除并返回此列表的最后一个元素。
        * public E pop():从此列表所表示的堆栈处弹出一个元素。
            pop 相当于 removeFirst
    */
    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<>();
        //1.使用add方法添加元素
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        System.out.println(linkedList);
        //2.pop == removeFirst
        String pop = linkedList.pop();
        //弹出来了加回去。
        linkedList.addFirst(pop);
        String removeFirst = linkedList.removeFirst();
        System.out.println(pop);
        System.out.println(removeFirst);

    }

    /*
        * public E getFirst():返回此列表的第一个元素。
        * public E getLast():返回此列表的最后一个元素。
    * */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<>();
        //1.使用add方法往集合【尾】中添加元素==addLast()
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        String first = linkedList.getFirst();
        String last = linkedList.getLast();
        System.out.println("first:"+first);
        System.out.println("last:"+last);
    }

    private static void show01() {
        //创建LinkedList 集合对象
        LinkedList<String> linkedList = new LinkedList<>();
        //1.使用add方法往链表集合中添加元素
        linkedList.add("迪丽热巴");
        linkedList.add("古力娜扎");
        linkedList.add("玛尔扎哈");
        System.out.println(linkedList);
        //2.往链表开头添加元素
//        linkedList.addFirst("明道");
        linkedList.push("明道");//与上等价。
        System.out.println(linkedList);
        //3.往链表结尾添加元素
//        linkedList.addLast("爱因斯坦");
        linkedList.add("爱因斯坦");//与上等价
        System.out.println(linkedList);
        linkedList.addFirst(null);
        System.out.println(linkedList);
        //
    }
}
