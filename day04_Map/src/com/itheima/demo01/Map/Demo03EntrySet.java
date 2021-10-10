package com.itheima.demo01.Map;
/*
    Map集合遍历的第二种方式：使用Entry对象遍历
    Map集合中的方法：
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图
    实现步骤：
        1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储到一个Set集合中
        2.遍历Set集合，获取每一个封装的键值对对象Entry对象
        3.使用Entry对象中的方法getKey()和getValue()方法获取键与值
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03EntrySet {
    public static void main(String[] args) {
        //1.创建对象
        Map<String, Integer> map = new HashMap<>();
        map.put("迪丽热巴", 168);
        map.put("古力娜扎", 165);
        map.put("玛尔扎哈", 170);
        //2.entrySet封装键值对
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        //3.遍历集合 -- 迭代器/增强for
        Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
        while(it.hasNext()) {
            //4.Map.Entry有getKey、getValue.
            Map.Entry<String, Integer> item = it.next();
            String key = item.getKey();
            Integer value = item.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
