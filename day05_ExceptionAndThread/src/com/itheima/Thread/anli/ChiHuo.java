package com.itheima.Thread.anli;
/*
    消费者：
        线程，继承Thread
        吃包子
        没包子：等待
        有包子：吃包子，吃完包子，修改包子状态，提醒包子铺生产包子
*/
public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒，吃包子
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"包子");
                //吃完
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把：" + bz.pi + bz.xian + "包子吃完了，包子铺开始生产包子");
                System.out.println("-----------------------------------------");
            }
        }
    }
}
