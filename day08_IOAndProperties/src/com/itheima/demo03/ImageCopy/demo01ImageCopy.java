package com.itheima.demo03.ImageCopy;
/*
    文件复制练习：
        一读一写
    明确：
        数据源：
        数据目的地：

    文件复制步骤：
        1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write，把读取到的字节写入到目的地的文件中
        5.释放资源。
*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 文件复制： 读 - 写
public class demo01ImageCopy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // 1. 读img
        FileInputStream fis = new FileInputStream("C:\\Users\\wuhaodong\\Pictures\\Saved Pictures\\DoubanPic\\5,美丽人生 9.5分.jpg");
        // 2. 写img
        FileOutputStream fos = new FileOutputStream("F:\\projects\\IdeaProjects\\beginner-code\\day08_IOAndProperties\\src\\com\\itheima\\image\\2.jpg");
        /*// 先读取：
        int len = 0;
        while((len = fis.read())!= -1){
            System.out.println(len);
            // 写入：
            fos.write(len);
        }*/
        // 读取：
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes))!=-1){
            // 写：
            fos.write(bytes);
        }
        // 3. 先关写流，后关读流. 如果写完了肯定读完了！
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start+"ms");
    }
}
