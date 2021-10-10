package com.itheima.demo03.hashCode;

import java.util.Objects;

/*
    哈希值：是一个十进制的整数，由系统随即给出（就是对象的地址值，是一个逻辑地址，是模拟得到的地址，不是数据实际存储的物理地址）
    在Object类中有一个方法，可以获取对象的哈希值
        public int hashCode()
    hashCode方法的源码：
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法。
*/
public class Demo01HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);
        /*
            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
        */
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);//false
        /*
            String类的哈希值
                String类重写Object类的hashCode方法
        */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
        System.out.println(s1==s2);//false -- 比的是地址值

        /*StringBuilder sb = new StringBuilder("abc");
        String ss1 = sb.toString();
        StringBuilder sb2 = new StringBuilder("abc");
        String ss2 = sb2.toString();
        System.out.println(sb==sb2);//false -- 比的地址
        System.out.println(Objects.equals(ss1,ss2));//true
//        sb.append("abc");
*/
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
