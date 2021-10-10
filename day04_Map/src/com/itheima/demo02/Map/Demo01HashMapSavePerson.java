package com.itheima.demo02.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的；
        作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
*/
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }
    /*
        HashMap存储【自定义类型 1】键值
        key:String类型
            String类重写hashCode方法和equals方法，可以保证key唯一
        value:Person类型
            value可以重复(同名同年龄的人视为同一个)
    */
    private static void show01() {
        HashMap<String, Person> hashMap = new HashMap<>();
        hashMap.put("北京", new Person("迪丽热巴", 18));
        hashMap.put("上海", new Person("古力娜扎", 19));
        hashMap.put("广东", new Person("陈奕迅", 30));
        hashMap.put("北京", new Person("钱学森", 70));
        /*【方法1】entrySet -- 存键值对对象*/
        Set<Map.Entry<String, Person>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Person> item : entrySet) {
            String key = item.getKey();
            Person value = item.getValue();
            System.out.println(key+":"+value);
        }
        /*【方法2】keySet -- 存key拿key找value*/
        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            Person person = hashMap.get(s);
            System.out.println(s+":"+person);
        }
    }
    /*
        HashMap存储【自定义类型 2】键值
        key:Person类型
            Person类就必须重写hashCode方法和equals方法，以保证key唯一
        value：String类型
            可以重复
    */
    public static void show02(){
        //1.创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        //2.添加
        map.put(new Person("女王", 18), "毛里求斯");
        map.put(new Person("秦始皇", 18), "秦国");
        map.put(new Person("普京", 30), "俄罗斯");
        map.put(new Person("女王", 18), "英国");//修正地名
        //3.使用entrySet
        Set<Map.Entry<Person, String>> entrySet = map.entrySet();
        for (Map.Entry<Person, String> entry : entrySet) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
