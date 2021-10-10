package com.itheima.demo01.BufferedStream;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/*
    练习：
        对文本的内容进行排序
        按照(1,2,3......)顺序排序
    分析：
        1.创建一个HashMap集合对象，可以：存储每行文本的序号(1,2,3,...);value:存储每行的文本
        2.创建字符缓冲输入流对象，构造方法中绑定字符输入流
        3.创建字符缓冲输出流对象，构造方法中绑定字符输出流
        4.使用字符缓冲输入流中的方法readLine,逐行读取文本
        5.对读取到的文本进行切割，获取行中的序号和文本内容
        6.把切割好的序号和文本的内容存储到HashMap集合中(key 序号是有序的，会自动排序1，2，3，4...)
        7.遍历HashMap集合，获取每一个键值对
        8.把每一个键值对，拼接为一个文本行
        9.把拼接好的文本，使用字符缓冲输出流中的方法write ,写入到文件中
        10.释放资源.
*/
public class Demo05Test {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个HashMap 集合对象，可以存储每行的文本 key - 序号；value - 内容
        HashMap<String, String> map = new HashMap<>();
        // 2. 创建字符缓冲输入流对象，构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("day10_IO\\src\\com\\itheima\\demo01\\BufferedStream\\save.txt"));
        // 3. 创建字符缓冲输出流对象，构造方法绑定字符输入流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_IO\\src\\com\\itheima\\demo01\\BufferedStream\\sort.txt"));
        try (br; bw) {
            // 4. readLine()
            String line = br.readLine();
            while (line != null) {
                // 5. split()
                String[] split = line.split("\\.");
                String key = split[0];
                String value = ".";
                for (int i = 1; i < split.length; i++) {
                    value += split[i];
                }
                map.put(key, value);
                line = br.readLine();
            }
            // 6. 遍历HashMap 集合，获取每一个键值对
            Set<String> keySet = map.keySet();
            for (String key : keySet) {
                bw.write(key+map.get(key));
                bw.newLine();
            }
            /*System.out.println(map);*/
        }
    }
}
