package com.itheima.Thread.demo04.sleep;
/*
    public static void sleep(long millis):使当前正在执行的线程暂停指定毫秒数。
    毫秒数结束之后，线程继续执行。
*/
public class Demo01Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            //使用sleep 模拟真实秒表跳动
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
