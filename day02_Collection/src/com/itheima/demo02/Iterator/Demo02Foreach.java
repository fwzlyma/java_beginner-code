package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;

/*
    增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写。
    是JDK 1.5之后出现的新特性。
    Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for循环
        public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。

    增强for循环：用来遍历集合和数组

    格式：
        for(集合/数组的数据类型 变量名：集合名/数组名){
            sout(变量名);
        }
*/
public class Demo02Foreach {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        //1.定义一个Collection多态
        Collection<String> coll = new ArrayList<>();
        //2.添加元素
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("刘诗诗");
        coll.add("吴奇隆");
        coll.add("凤凰传奇");
        //3.遍历--for循环
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
