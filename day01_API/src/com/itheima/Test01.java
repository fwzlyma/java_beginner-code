package com.itheima;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        //System的两个小方法:
        //1.获取当前系统的毫秒值时间
        long nowMills = System.currentTimeMillis();
        System.out.println(nowMills);

        //2.复制数组的方法--arraycopy()方法
        int[] src = new int[]{1,2,3,4,5,6};
        int[] dest = new int[3];
        System.arraycopy(src,3,dest,0,3);
        /*for (int item : dest) {
            System.out.println();
        }*/
        //将定义的数组通过Arrays.toString方法转换成遍历字符串,方便观看.
        System.out.println(Arrays.toString(dest));

    }
}
