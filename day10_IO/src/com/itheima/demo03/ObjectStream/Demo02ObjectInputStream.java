package com.itheima.demo03.ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    java.io.ObjectInputStream extends InputStream
    ObjectInputStream : 对象的反序列化流
    作用：把文件中保存的对象，以流的方式读取出来使用

    构造方法：
        ObjectInputStream(InputStream in) 创建从指定 InputStream 读取的 ObjectInputStream。
        参数：
            InputStream in : 字节输入流
    特有的成员方法：
        Object readObject() 从ObjectInputStream 读取对象。
    使用步骤：
        1.创建ObjectInputStream 对象，构造方法中传递字节输入流
        2.使用ObjectInputStream 对象中的方法readObject 读取保存对象的文件
        3.释放资源
        4.使用读取出来的对象（打印）

    readObject 方法声明抛出了ClassNotFoundException(class文件找不到异常)
    当不存在对象的class 文件时抛出此异常
    反序列化的前提：
        1.要序列化、反序列化的类必须 implements Serializable 接口
        2.必须存在类对应的class 文件
        3.在writeObject() 写文件时可以多写一个null,这样就可以控制判断条件是null时遍历结束。
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1. 创建ObjectInputStream 对象,构造方法传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10_IO\\src\\com\\itheima\\demo03\\ObjectStream\\output.txt"));
        // 2. readObject读取保存对象的文件
        Person p1 = null;
        while ((p1 = (Person) ois.readObject()) != null) {
            System.out.println(p1);
        }
        ois.close();
    }
}
