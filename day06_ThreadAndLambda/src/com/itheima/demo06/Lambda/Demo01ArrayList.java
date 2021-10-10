package com.itheima.demo06.Lambda;

import java.util.ArrayList;

/*
    Lambda 表达式：可推导，可省略
    凡是根据上下文推导出来的内容，都可以省略书写
    可以省略的内容：
        1.数据类型可省略
        2.如果参数列表中参数只有一个，那么类型和（）都可以省略
        3.如果{} 代码只有一行，无论是否有返回值都可以省略{} 和 return 和分号"；"
            这三个要一起省。
            （）不可省略。
*/
public class Demo01ArrayList {
    public static void main(String[] args) {
        //JDK 1.7之前，创建集合对象必须把前后的泛型都写上
        ArrayList<String> list01 = new ArrayList<String>();
        //JDK 1.7之后，=号后边泛型可以省略，后边可推导。
        ArrayList<String> list = new ArrayList<>();

    }
}
