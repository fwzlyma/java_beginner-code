package com.itheima.demo03.Generic;

/*
    测试含有泛型的接口
*/
public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl对象
        GenericInterfaceImpl gi = new GenericInterfaceImpl();
        gi.method("古力娜扎");
        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Object> ogi2 = new GenericInterfaceImpl2<>();
        ogi2.method("迪丽热巴");
        ogi2.method(1.2);
        ogi2.method(true);
        ogi2.method(12345);
    }
}
