package com.itheima.Thread.demo03.setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread thread = new MyThread();
//        thread.setName("小强");
        thread.start();
        new MyThread("迪丽热巴").start();
    }
}
