package com.itheima.Thread.demo09.Synchronized;

/*
    卖票案例--线程安全。
    【2】使用同步方法
        使用步骤：
            1.把访问了共享数据的代码抽取出来，放到一个方法中
            2.在方法上添加synchronized 修饰符
        格式；
            定义方法的格式
            修饰符 synchronized 返回值类型 方法名（参数列表）{
                可能出现线程安全问题的代码（即哪些访问了共享数据的代码）
            }
*/
public class RunnableImpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;
    //创建一个锁对象
    Object obj = new Object();

    //设置线程任务：卖票
    @Override
    public void run() {
        System.out.println("this:" + this);//this:RunnableImpl@7c30a502
        //使用死循环，让卖票操作重复执行
        while (true) {
            payTicket2();
        }
    }

    /*
        定义一个同步方法
            同步方法也会把代码锁住
            只让一个线程执行
            同步方法的锁对象是谁？
            就是实现类对象 new RunnableImpl()
            也就是this
    */
    public synchronized void payTicket() {
        //先判断票是否存在
        if (ticket > 0) {
            //提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //票存在，卖票
            System.out.println(Thread.currentThread().getName() + "->卖了第" + ticket + "张票.");
            ticket--;
        }
    }

    public void payTicket2() {
        synchronized (this) {
            //先判断票是否存在
            if (ticket > 0) {
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在，卖票
                System.out.println(Thread.currentThread().getName() + "-->卖了第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
