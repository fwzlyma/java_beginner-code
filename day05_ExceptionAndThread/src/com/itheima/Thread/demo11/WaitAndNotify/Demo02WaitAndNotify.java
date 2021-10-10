package com.itheima.Thread.demo11.WaitAndNotify;
/*
    进入到TimeWaiting(计时等待)有两种方式
        1.使用sleep(long m) 方法，毫秒值， 结束后进入Runnable/Blocked状态
        2.使用wait(long m) 方法，wait 方法如果计时结束没被唤醒，自动醒来

    唤醒的方法：
        1.notify() 唤醒单个
        2.notifyAll()  唤醒所有线程。
*/
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程--消费者
        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
                while(true){
                    //保证等待和唤醒线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu执行，进入到WAITING状态（无限等待）
                        System.out.println("等待...");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行
                        System.out.println("包子已经做好了，顾客1开吃!");
                        System.out.println("-----------------------------------------");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
                while(true){
                    //保证等待和唤醒线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu执行，进入到WAITING状态（无限等待）
                        System.out.println("等待...");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行
                        System.out.println("包子已经做好了，顾客2开吃!");
                        System.out.println("-----------------------------------------");
                    }
                }
            }
        }.start();
        //创建一个老板线程
        Runnable boss = new Runnable() {
            @Override
            public void run() {
                //一直等着做包子
                while(true){
                    //花了5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //保证等待和唤醒线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("老板5秒钟之后做好包子，告知顾客，可以吃包子了");
                        //做好包子之后，调用notify 方法，唤醒顾客吃包子
                        obj.notifyAll();
                    }
                }
            }
        };
        new Thread(boss).start();
    }
}
