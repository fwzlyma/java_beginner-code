package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<K,V>集合
    Map集合的特点：
        1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
        2.Map集合中的元素，key和value的数据类型可以相同，也可以不同。
        3.Map集合中的元素，key是不允许重复的，value是可以重复的。
        4.Map集合中的元素，key和value是一一对应的。
    *【1】java.util.HashMap<K,V> implements Map<K,V>接口 -- 这块只讲了这个
    HashMap 集合的特点：
        1.HashMap集合底层是哈希表：查询的速度特别的快
            JDK 1.8之前：数组+单向链表
            JDK 1.8之后：数组+单向链表/红黑树(链表长度超过8变成红黑树):提高查询的速度
        2.hashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
    【2】java.util.LinkedHashMap<K,V> extends HashMap<K,V> 集合
    LinkedHashMap的特点：
        1.LinkedHashMap集合底层是哈希表+链表
        2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的。
*/
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }
    /*
        【方法1】 V put(K key, V value);
           返回值：V
               存储键值对的时候，key不重复，返回值v是null
               存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值。
    */
    private static void show01() {
        //1.多态：接口 -> HashMap
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println(v1);//null
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println(v2);//范冰冰1 -- 被换掉的V

        System.out.println(map);//{李晨=范冰冰2}

        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map);//{杨过=小龙女, 尹志平=小龙女, 李晨=范冰冰2, 郭靖=黄蓉}
    }
    /*
        【方法2】 V remove(Object key);把指定键对应的键值对元素，在Map集合中删除，返回被删除的元素的值。
            返回值：V
                key存在，v返回被删除的值
                key不存在，v返回null
    */
    public static void show02(){
        //1.使用多态创建HashMap对象。
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨幂", 165);
        map.put("林志玲", 178);
        System.out.println(map);//{林志玲=178, 赵丽颖=168, 杨幂=165}
        //2.使用remove删除一个 -- 使用key删除，返回value.
        String name = "林志玲1";
        Integer height = map.remove(name);//包装类可以装null ，基本类型不行。
        if(height == null){
            System.out.println("没有查询到"+name);
        }else{
            System.out.println("删除了身高"+height+"cm的"+name+".");
        }
    }
    /*
        【方法3】 V get(Object key);通过键获取值
            返回值：
                key存在返回对应的value
                key不存在返回null
    */
    public static void show03(){
        //1.创建对象
        Map<String, Integer> map = new HashMap<>();
        map.put("迪丽热巴", 168);
        map.put("古力娜扎", 165);
        map.put("玛尔扎哈", 170);
        //2.get(key) -- value
        String name = "迪丽热巴";
        Integer v1 = map.get(name);
        if(v1 == null){
            System.out.println("未找到...");
        }else {
            System.out.println("=============");
            System.out.println("name:"+name);
            System.out.println("v1:"+v1);
        }
    }
    /*
        【方法4】boolean containsKey(Object key);判断是否包含key
        包含返回true，不包含返回false.
    */
    public static void show04(){
        //1.创建对象
        Map<String, Integer> map = new HashMap<>();
        map.put("迪丽热巴", 168);
        map.put("古力娜扎", 165);
        map.put("玛尔扎哈", 170);
        //2.containsKey(key)
        boolean b1 = map.containsKey("古力娜扎");
        System.out.println(b1);//true
        boolean b2 = map.containsKey("古力娜扎1");
        System.out.println(b2);//false
    }
    /*
        【方法5】遍历set集合
        使用迭代器/增强for遍历set集合获取Map集合的每一个key
    */

}
