package com.itheima.demo01object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = null;
        boolean b = s1.equals(s2);//true
        System.out.println(b);

        /*boolean b1 = s3.demo02equals(s1);*/
        //Exception in thread "main" java.lang.NullPointerException
        //原因：null调用不了方法，会抛出异常。

        boolean b1 = Objects.equals(s3, s1);//false
        System.out.println(b1);
        /*
            Objects类的equals方法：对两个对象进行比较，防止空指针异常。
            public static boolean demo02equals(demo01object a, demo01object b) {
                return (a == b) || (a != null && a.demo02equals(b));
        }*/

    }
}
