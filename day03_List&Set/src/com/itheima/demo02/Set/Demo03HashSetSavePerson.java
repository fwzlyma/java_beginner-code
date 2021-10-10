package com.itheima.demo02.Set;

import java.util.HashSet;

/*
    HashSet 存储【自定义类型元素】
    set 集合报错元素唯一：
        存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法。
    要求：
        同名同年龄的人，视为同一人，只能存储一次。
*/
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        Person p1 = new Person("重地",20);
        Person p2 = new Person("通话",20);
        Person p3 = new Person("通话",20);
        Person p4 = new Person("通话",20);
//        System.out.println(p2 == p3);//false
        //创建一个HashSet存储人
        HashSet<Person> personsHashSet = new HashSet<>();
        //shift+f6 替换相同变量名称
        personsHashSet.add(p1);
        personsHashSet.add(p2);
        personsHashSet.add(p3);
        personsHashSet.add(p4);
        System.out.println(personsHashSet);
    }
}
