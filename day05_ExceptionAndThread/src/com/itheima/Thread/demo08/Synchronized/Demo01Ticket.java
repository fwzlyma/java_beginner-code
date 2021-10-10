package com.itheima.Thread.demo08.Synchronized;

/*
    模拟卖票案例
    创建3个线程，同时开启
*/
public class Demo01Ticket {
    public static void main(String[] args) {
        //1.创建RunnableImpl
        RunnableImpl run = new RunnableImpl();
        //2.创建Thread 对象
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
