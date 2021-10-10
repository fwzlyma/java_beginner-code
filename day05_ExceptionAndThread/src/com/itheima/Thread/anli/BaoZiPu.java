package com.itheima.Thread.anli;
/*
    生产者：线程，继承Thread
    任务：生产包子
    对包子判断：
        true：包子铺wait 进入等待
        false: 包子铺生产包子，生产两种包子，两个状态
                生产好了包子，修改包子状态true ，唤醒吃货线程。
    注意：
        包子铺线程和包子线程关系--> 通信 （互斥）
        必须使用同时同步技术保证两个线程只能有一个在执行
        锁对象必须保证唯一，可以使用包子对象作为锁对象
        包子铺类和吃货的类就需要把包子对象作为参数传递进来
            1.需要在成员为止创建一个包子遍历
            2.使用带参数的构造方法，为这个包子变量赋值
*/
public class BaoZiPu extends Thread{
    //1.需要在成员为止创建一个包子变量
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }
    //设置线程任务run -- 生产包子
    @Override
    public void run() {
        int count = 0;
        while(true){
            synchronized (bz){
                //判断包子状态
                if(bz.flag==true){
                    try {
                        //必须调用包子对象 -- 即锁对象来wait
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //生产包子
                if(count%2==0){
                    //薄皮三鲜包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    bz.pi = "厚皮";
                    bz.xian = "羊肉馅";
                }
                count++;
                System.out.println("包子铺正在生产:"+bz.pi+bz.xian+"包子...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //生产好
                bz.flag = true;
                //唤醒吃货
                bz.notify();
                System.out.println("包子铺已经生产好了"+bz.pi+bz.xian+"包子，吃货可以吃了");
            }
        }
    }
}
