package com.itheima.demo05System;

import java.util.Arrays;

/*
    java.lang.System提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：
        -public static long currentTimeMills():返回以毫秒为单位的当前时间。
        -public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length):
            将数组中指定的数据拷贝到另一个数组中
*/
public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }

    private static void demo02() {
        //  -public static void arraycopy
        //        (Object src, int srcPos, Object dest, int destPos, int length):
        /*
            参数：
                src - 源数组。
                srcPos - 源数组中的起始位置。
                dest - 目标数组。
                destPos - 目标数据中的起始位置。
                length - 要复制的数组元素的数量。
            【练习】
            把src数字中前3个元素，复制到dest数组的前3个位置上
            src : [1,2,3,4,5]
            dest: [6,7,8,9,10]
            复制后：
            src: [1,2,3,4,5]
            dest: [1,2,3,9,10]
        */
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        //遍历前，使用Arrays.toString()遍历数组
        System.out.println("复制前："+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));
        /*for (int i : dest) {
            demo05System.out.println(i);
        }*/
    }

    private static void demo01() {
        //-public static long currentTimeMills():返回以毫秒为单位的当前时间。
        //用来测试程序的效率
        //练习：验证for循环打印数字1-999所需要使用的时间（毫秒）
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i+1);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("time:"+time+"ms");
    }
}
