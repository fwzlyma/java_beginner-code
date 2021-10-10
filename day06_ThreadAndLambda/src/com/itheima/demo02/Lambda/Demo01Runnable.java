package com.itheima.demo02.Lambda;
/*
    使用实现Runnable 接口的方式实现多线程程序
*/
public class Demo01Runnable {
    public static void main(String[] args) {
        //创建Runnable 接口的实现类对象
        Runnable r = new RunnableImpl();
        //创建Thread 类对象，构造方法中传递Runnable 接口的实现类
        Thread thread = new Thread(r);
        //调用start 方法开启新线程，执行run 方法.
        thread.start();

        //简化代码 -- 但是真正想做的是传递run 这段代码。
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了.");
            }
        }).start();
    }
}
