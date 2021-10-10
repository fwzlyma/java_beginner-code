package com.itheima.demo03.Generic;

/*测试含有泛型的方法*/
public class Demo03GenericMethod {
    public static void main(String[] args) {
        //1.创建一个GenericMethod对象--普通方法
        GenericMethod gm = new GenericMethod();
        /*
            调用含有泛型的方法method01
            传递什么类型，泛型就是什么类型
        */
        gm.method01(10);
        gm.method01("迪丽热巴");
        gm.method01(8.8);
        gm.method01(true);
        //2.调用对象的--静态方法--静态方法属于类本身。
        //静态方法不建议创建对象使用
        GenericMethod.method02("古力娜扎");
        //????有何区别呢？
        GenericMethod22<Object> ogc = new GenericMethod22<>();
        ogc.method01("abc");
    }
}
