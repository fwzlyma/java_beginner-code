package com.itheima.Thread.demo06.InnerClassThread;
/*
    匿名内部类方式实现线程的创建
    匿名：没有名字
    内部类：写在其他类内部的类
    匿名内部类作用：简化代码
        把子类继承父类，重写父类的方法，创建子类对象一步走。
        把实现类实现类接口，重写接口中的方法，创建实现类对象合成一部完成。
    匿名内部类的最终产物：子类/实现类对象，而这个类没有名字

    格式：
        new 父类/接口(){
            重写父类/接口的方法;
        };
*/
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        // new MyThread().start();
        new Thread(){
            //重写run 方法，设置线程任务

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--迪丽热巴");
                }
            }
        }.start();
        //线程的接口Runnable
        //RunnableImpl r = new RunnableImpl();//之前
        //Runnable r = new RunnableImpl();//多态
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--古力娜扎");
                }
            }
        };
        Thread t2 = new Thread(r);
        t2.start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--无极剑圣");
                }
            }
        }).start();
    }
}
