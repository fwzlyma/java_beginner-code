package com.itheima.demo02.Set;

import java.util.HashSet;

/*
    Set集合不允许重复重复元素的【原理】
*/
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> hashSet = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add("重地");
        hashSet.add("通话");
        hashSet.add("abc");
        System.out.println(hashSet);//[重地, 通话, abc]

        /*
            Set集合在调用add方法的时候,add方法会调用元素的hashCode和equals方法，判断元素是否重复。
            add方法会调用s1的hashCode方法，计算字符串“abc”的哈希值，哈希值是96354
                1.在集合中找有没有96354这个哈希值的元素，发现没有就会把s1存储到集合中。
                2.找到这个哈希值，就比较链表/红黑树查询结果用equals比较，没有true就存进去。
            s2会调用equals方法和哈希值相同的元素进行比较 s2.equals(s1) 返回true
            两个元素的哈希值相同，equals方法返回true，认定两个元素相同
            就不会把s2存储到集合中。

            "重地": add方法没找到hashCode的相同哈希值，把它存到集合中。
            "通话": add方法hashCode计算哈希值，得到与"重地"相同，
                    "通话".equals("重地")返回false
                    认定两个元素不同，把"通话"存到集合中
        */
    }
}
