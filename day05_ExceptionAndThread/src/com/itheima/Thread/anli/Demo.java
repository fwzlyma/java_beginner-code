package com.itheima.Thread.anli;
/*
    测试类：
        包含main
        创建包子对象
        创建包子铺线程
        创建吃货线程
*/
public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        BaoZiPu producer = new BaoZiPu(bz);
        ChiHuo customer = new ChiHuo(bz);
        producer.start();
        customer.start();
    }
}
