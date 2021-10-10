package com.itheima.Thread.demo02.Thread;
/*
    创建多线程程序的第一种方式：创建Thread类的子类
    java.lang.Thread类：是描述线程的类，想要实现，需要继承Thread类
    实现步骤：
        1.创建一个Thread类的子类
        2.在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么？）
        3.创建Thread类的子类对象
        4.调用Thread类中的方法start方法，开启新的线程，执行run方法
            void start() 使该线程开始执行，Java虚拟机调用该线程的run方法。
            结果是两个线程并发的执行，当前线程main 和另外一个线程（创建新的线程，执行其run方法）
            多次启动一个线程是非法的。特别是当线程已经结束，不能再重新启动。
    java程序属于抢占式调度，优先级高的先执行，相同随机选一个先执行。

    线程的名称：
        主线程：main
        新线程：Thread-0，Thread-1，Thread-2...   Thread[Thread-0,5,main]
*/
public class Demo01Thread {
    public static void main(String[] args) {
        //3.创建线程子类对象
        MyThread t1 = new MyThread();
        //4.调用Thread类中的方法start方法，开启新的线程，执行run方法
        t1.start();
        System.out.println(Thread.currentThread().getName());//main
        /*
            1.JVM 执行main，找OS开辟一条main方法通向cpu的路径
                这个路径叫main线程，主线程
                cpu通过这个线程，这个路径就可以齿形main方法
            2.定义一个 new MyThread，开辟通向cpu的新路径 -- 新加了一个栈，cpu可选择执行其中一个栈。
                用来执行run方法
            cpu可以选择两个路径的随机一条。
        */
    }
}
