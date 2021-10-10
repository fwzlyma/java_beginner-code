package com.itheima.demo07.Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
    Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
    Properties 集合是一个唯一和IO 流相结合的集合。
        可以使用Properties 集合中的方法store ，把集合中的临时数据，持久化写入到硬盘中存储。
        可以使用Properties 集合中的方法load ， 把硬盘中保存的文件（键值对），读取到集合中使用

    属性列表中每一个键及其对应值都是一个字符串.
        Properties 集合是一个双列集合，key 和value 默认都是字符串。
*/
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();
    }
    /*
        可以使用Properties 集合中的方法load ， 把硬盘中保存的文件（键值对），读取到集合中使用
        void load(InputStream inStream)
        void load(Reader reader)
        参数：
            InputStream inStream : 字节输入流，不能读取含有中文的键值对
            Reader reader : 字符输入流，能读取含有中文的键值对
        使用步骤：
            1.创建Properties 集合对象
            2.使用Properties 集合对象中的方法load 读取保存键值对的文件
            3.遍历Properties 集合
        注意：
            1.存储键值对的文件中，键与值默认的连接符号可以使用 = 空格
            2.存储键值对的文件中，可以使用# 进行注释，被注释的键值对不会再被读取
            3.存储键值对的文件中，键与值默认都是字符串，不用再加引号
    */
    private static void show03() throws IOException {
        // 1. 创建Properties 集合对象
        Properties prop = new Properties();
        // 2. 使用Properties 集合对象中的方法load 读取保存键值对的文件
        prop.load(new FileReader("day08_IOAndProperties\\src\\com\\itheima\\demo07\\Properties\\save.txt"));
        // 3. 遍历Properties 集合 -- 有中文，使用字符流.
        Set<String> names = prop.stringPropertyNames();
        for (String name : names) {
            System.out.println(name+":"+prop.getProperty(name));
        }
    }

    /*
        可以使用Properties 集合中的方法store ，把集合中的临时数据，持久化写入到硬盘中存储。
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数：
            OutputStream out : 字节输出流，不能写入中文
            Writer writer : 字符输出流，可以写中文
            String comments : 注释，用来解释说明保存的文件是做什么用的
                不能使用中文，会产生乱码，默认是Unicode 编码
                一般使用“” 空字符串
        使用步骤：
            1.创建Properties 集合对象，添加数据
            2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
            3.使用Properties 集合中的方法store ，把集合中的临时数据，持久化写入到硬盘中存储
            4.释放资源
    */
    private static void show02() throws IOException {
        // 1. 创建Properties 对象
        Properties prop = new Properties();
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "168");
        prop.setProperty("玛尔扎哈", "160");
        // 2. 创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
        // 字节流 -- 不能中文、字符流 -- 可中文
        File f = new File("day08_IOAndProperties\\src\\com\\itheima\\demo07\\Properties\\save.txt");
        if (!f.exists()) {
            boolean newFile = f.createNewFile();
            System.out.println(newFile);
        }
        FileWriter fw = new FileWriter("day08_IOAndProperties\\src\\com\\itheima\\demo07\\Properties\\save.txt",true);
        // 3. 使用Properties 集合中的方法store ,把集合中的临时数据持久化写入到硬盘中存储
        prop.store(fw,"save data");
        // 4. 释放资源
        fw.close();
    }

    /*
        使用Properties 集合存储数据，遍历取出集合中的数据
        Properties 集合是一个双列集合，key 和value 默认都是字符串。
        Properties 集合有一些操作字符串的特有方法。
            Object setProperty(String key, String value) 调用 Hashtable 的方法 put。
            String getProperty(String key) 用指定的键在此属性列表中搜索属性。 -- 相当于Map 集合中的 get(key) 方法
            Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串，相当于Map 集合中的keySet 方法
    */
    private static void show01() {
        // 1. 创建一个Properties 集合对象
        Properties prop = new Properties();
        // 2. 使用setProperties 添加数据
        prop.setProperty("迪丽热巴", String.valueOf(168));
        prop.setProperty("古力娜扎", String.valueOf(165));
        prop.setProperty("赵丽颖", String.valueOf(160));
        // 3. 使用stringPropertyNames() 取集合的键
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.print(s);
            System.out.println(":"+prop.getProperty(s));
        }
    }
}
