package com.itheima.demo03.ObjectStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/*
    练习：序列化集合
        当我们想在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中
        对集合进行序列化和反序列化
        --解决了反序列化的时候遍历对象的问题
    分析：
        1.定义一个存储Person对象的ArrayList 集合
        2.往ArrayList 集合中存储Person 对象
        3.创建一个序列化流ObjectOutputStream 对象
        4.使用ObjectOutputStream 对象中的方法writeObject,对集合进行序列化
        5.创建一个反序列化ObjectInputStream 对象
        6.使用ObjectInputStream 对象中的方法readObject 读取文件中保存的集合
        7.把Object 类型的集合转换为ArrayList 类型
        8.遍历ArrayList 集合
        9.释放资源
*/
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1. 定义对象集合
        HashSet<Person> set = new HashSet<>();
        // 2. 添加对象
        set.add(new Person("迪丽热巴", 20));
        set.add(new Person("古力娜扎", 19));
        set.add(new Person("古力娜扎", 19));
        set.add(new Person("古力娜扎", 19));
        // 3. 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10_IO\\src\\com\\itheima\\demo03\\ObjectStream\\output.txt"));
        // 4. 写文件
        oos.writeObject(set);
        oos.close();
        // 5. 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10_IO\\src\\com\\itheima\\demo03\\ObjectStream\\output.txt"));
        // 6. 读文件
        Object o = ois.readObject();
        ois.close();
        HashSet<Person> people = (HashSet) o;
        // 比较对象，Person 类需要实现comparable 接口
        // Comparable<Person> -- 作为父类接口
        ArrayList<Person> list = new ArrayList<>();
        for (Person person : people) {
            list.add(person);
        }
        // 使用Lambda 表达式
        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        Collections.sort(list, (o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(list);
    }
}
