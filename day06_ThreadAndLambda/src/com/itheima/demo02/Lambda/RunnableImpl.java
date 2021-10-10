package com.itheima.demo02.Lambda;
/*
    创建Runnable 接口的实现类，重写run 方法，设置线程任务
*/
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建...");
    }
}
