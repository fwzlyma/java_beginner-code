package com.itheima.demo01.BufferedStream;

import java.io.*;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        show01();  /*184ms*/
        show02();   /*2ms*/
        show03();   /*1ms*/
    }

    private static void show01() throws FileNotFoundException {
        // 1. 一次读写一个字节
        FileInputStream fis = new FileInputStream("C:\\Users\\wuhaodong\\Pictures\\Saved Pictures\\DoubanPic\\45,闻香识女人 9.1分.jpg");
        FileOutputStream fos = new FileOutputStream("day10_IO\\src\\com\\itheima\\demo01\\BufferedStream\\1.jpg");
        long start = System.currentTimeMillis();
        try (fis; fos) {
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start) + "ms");
    }

    private static void show02() throws FileNotFoundException {
        // 2. 使用数组缓冲
        FileInputStream fis = new FileInputStream("C:\\Users\\wuhaodong\\Pictures\\Saved Pictures\\DoubanPic\\45,闻香识女人 9.1分.jpg");
        FileOutputStream fos = new FileOutputStream("day10_IO\\src\\com\\itheima\\demo01\\BufferedStream\\2.jpg");
        long start = System.currentTimeMillis();
        try (fis; fos) {
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start) + "ms");
    }

    private static void show03() throws FileNotFoundException {
        // 3. 使用缓冲流
        FileInputStream fis = new FileInputStream("C:\\Users\\wuhaodong\\Pictures\\Saved Pictures\\DoubanPic\\45,闻香识女人 9.1分.jpg");
        FileOutputStream fos = new FileOutputStream("day10_IO\\src\\com\\itheima\\demo01\\BufferedStream\\3.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long start = System.currentTimeMillis();
        try (fis; fos; bis; bos) {
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start) + "ms");
    }
}
