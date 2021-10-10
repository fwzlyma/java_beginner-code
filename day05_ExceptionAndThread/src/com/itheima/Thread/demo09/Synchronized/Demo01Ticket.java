package com.itheima.Thread.demo09.Synchronized;

public class Demo01Ticket {
    public static void main(String[] args) {
        //1.创建RunnableImpl
//        RunnableImpl run = new RunnableImpl();
        RunnableImpl2 run = new RunnableImpl2();
        System.out.println("run:"+run);//run:RunnableImpl@7c30a502
        //2.创建Thread 对象
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
