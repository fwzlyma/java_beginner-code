package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合的第一种遍历方式：通过键找值的方式
    Map集合中的方法：
        Set<K> keySet(); 返回此映射中包含的键的set视图
    实现步骤：
        1.使用Map集合中的方法keySet(),把Map集合所有的key取出来，存到一个Set集合中
        2.遍历set集合，获取Map集合中的每一个key
        3.通过Map集合中的方法get(key) --> value
*/
public class Demo02KeySet {
    public static void main(String[] args) {
        //1.创建对象
        Map<String, Integer> map = new HashMap<>();
        map.put("迪丽热巴", 168);
        map.put("古力娜扎", 165);
        map.put("玛尔扎哈", 170);
        //2. Set<K> keySet();
        Set<String> keySet = map.keySet();
        //3. 遍历Set集合 -- 迭代器/增强for
        for (String s : keySet) {
            Integer value = map.get(s);
            System.out.println(s+":"+value);
        }
        /*Iterator<String> it = keySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
    }
}
