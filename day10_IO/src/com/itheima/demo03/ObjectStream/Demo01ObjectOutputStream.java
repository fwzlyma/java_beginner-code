package com.itheima.demo03.ObjectStream;

import java.io.*;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream : 对象的序列化流
    作用：把对象以流的方式写入到文件中保存
    构造方法：
        ObjectOutputStream(OutputStream out) 创建写入指定 OutputStream 的 ObjectOutputStream
        参数：
            OutputStream out : 字节输出流
    特有的成员方法：
        void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream
    使用步骤：
        1.创建ObjectOutputStream 对象，构造方法中传递字节输出流
        2.使用ObjectOutputStream 对象中的方法writeObject,把对象写入到文件中
        3.释放资源
*/
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1. 使用ObjectOutputStream 写字节流 到文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10_IO\\src\\com\\itheima\\demo03\\ObjectStream\\output.txt"));
        // 2. 使用writeObject方法把对象写入文件
        oos.writeObject(new Person("迪丽热巴",20));
        oos.writeObject(new Person("古力娜扎",19));
        // 插入null 作为结束标志
        oos.writeObject(null);
        oos.close();
        // java.io.NotSerializableException
        /*
            序列化和反序列化的时候，会抛出异常
            必须实现Serializable 接口 才能实现序列化和反序列化。！！！
            相当于菜市场的肉的检疫章。
        */
        // public class Person implements Serializable
        // 3. 使用ObjectInputStream 读文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10_IO\\src\\com\\itheima\\demo03\\ObjectStream\\output.txt"));
        try (ois) {
            Person p = (Person) ois.readObject();
            while (p != null) {
                System.out.println(p);
                if ((p = (Person) ois.readObject()) == null) {
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
