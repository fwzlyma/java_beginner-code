package com.itheima.demo01object;

import java.util.Random;

public class Demo02Equals {
    public static void main(String[] args) {
    //  Person类默认继承了Object类,所以可以使用Object类的equals方法
    //  boolean demo02equals(demo01object obj)指示某个对象是否与此对象"相等"
    //  public boolean demo02equals(demo01object obj) {
    //       return (this == obj);
    // }
    //      参数:
    //           demo01object obj:可以传递任意的对象
    //      方法体:
    //           ==:比较运算符,返回布尔值
    //           基本数据类型:比较的是值
    //           引用数据类型:比较的是地址
    //      this:谁调用的方法,谁就是this,如下面的p1;
    //      obj是谁:传递过来的p2.
        Person p1 = new Person("迪丽热巴", 20);
        Person p2 = new Person("古力娜扎", 20);
        System.out.println(p1);
        System.out.println(p2);

        /*p1 = p2;*/

        System.out.println(p1.equals(p2));//false true
        System.out.println("-------------------------------------");

        //重写equals比较两个对象的属性值。
        Person person1 = new Person("张三", 20);
        Person person2 = new Person("张三", 20);
        System.out.println(person1);
        System.out.println(person2);

        Random r = new Random();

        System.out.println(person1.equals(person2));//true

        System.out.println(person1.equals(r));//false
        System.out.println(person1.equals(null));//false

        /*demo01object obj = new Person("张三", 20);
        demo05System.out.println(obj instanceof Person);//true
        demo05System.out.println(obj instanceof demo01object);//true*/
    }
}
