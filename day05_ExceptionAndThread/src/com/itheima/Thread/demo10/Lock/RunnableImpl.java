package com.itheima.Thread.demo10.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    实现卖票案例--线程安全处理：
    【3】使用Lock锁
        java.util.concurrent.locks.Lock接口
        Lock 实现提供了比synchronized 方法更好的操作
        Lock 接口中的方法：
            void lock() 获取锁。
            void unlock() 释放锁.
        java.util.concurrent.locks.ReentrantLock implements Lock接口

        使用步骤：
            1.在成员为止创建一个ReentrantLock对象
            2.在可能会出现安全的代码前调用Lock接口的方法lock() 获取锁
            3.在可能会出现安全问题的代码后调用Lock接口的方法unlock() 释放锁
*/
public class RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;
    //1. 创建ReentrantLock对象
    Lock l = new ReentrantLock();
    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while(true){
            //2.在可能会出现安全的代码前调用Lock接口的方法lock() 获取锁
            l.lock();
            //先判断票是否存在
            if(ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    //票存在，卖票
                    System.out.println(Thread.currentThread().getName()+"-->卖了第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //3.在可能会出现安全问题的代码后调用Lock接口的方法unlock() 释放锁
                    l.unlock();//无论程序是否异常都释放锁。
                }
            }
        }
    }
    /*@Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while(true){
            //2.在可能会出现安全的代码前调用Lock接口的方法lock() 获取锁
            l.lock();
            //先判断票是否存在
            if(ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在，卖票
                System.out.println(Thread.currentThread().getName()+"-->卖了第"+ticket+"张票");
                ticket--;
            }
            //3.在可能会出现安全问题的代码后调用Lock接口的方法unlock() 释放锁
            l.unlock();
        }
    }*/
}
