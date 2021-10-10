package com.itheima.demo02equals;

import java.util.Objects;

public class Test03 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(Objects.equals(str1,str2));//true

        /*String str3 = null;
        demo05System.out.println(str3.demo02equals(str1));*///Exception in thread "main" java.lang.NullPointerException
        System.out.println(Objects.equals(str1,null));//false
    }
}
