package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序--有序
    底层原理：
        哈希表+链表(记录元素的顺序)
*/
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        //1.创建LinkedHashMap -- 多态
        HashMap<String, String> map = new LinkedHashMap<>();
        //2.添加
        map.put("b", "b");
        map.put("a", "a");
        map.put("c", "c");
        map.put("a", "d");//替换之前的key--a的value--a  ->  d
        System.out.println(map);
        /*观察HashMap顺序*/
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("b", "b");
        map1.put("a", "a");
        map1.put("c", "c");
        map1.put("a", "d");
        System.out.println(map1);//按key排序的。"无序"--无存放顺序。
    }
}
