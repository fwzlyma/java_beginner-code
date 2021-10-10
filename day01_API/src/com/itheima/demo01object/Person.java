package com.itheima.demo01object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    * 直接打印对象的地址值没有意义，需要重写Object类的toString方法
    * 打印对象的属性（name,age）
    * */
    /* Object类的equals方法默认比较的是两个对象的地址值，没有意义
     所以我们需要重写equals方法，比较两个对象的属性值。（name,age）
           对象的属性值一样好，返回true，否则返回false
           问题：
               隐含一个多态
               demo01object obj = p2 = new Person("古力娜扎",18);
               多态弊端：无法使用子类特有的内容（属性，方法）
               解决：可以使用向下转型。把Object类型转换为Person。
     */
    //向下转型--强转。
    //第一个版本的重写equals
    /*@Override
    public boolean demo02equals(demo01object o) {
        if (this == o) return true;
        //getClass() != o.getClass() 使用反射技术，判断o是否为Person类型，等效于 obj  instanceof  Person
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.demo02equals(person.name) : person.name == null;
    }*/
    //第二个版本的重写equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    /*@Override
    public boolean demo02equals(demo01object obj) {
        //判断是否是自己,增加程序效率
        if(obj == this){
            return true;
        }
        //判断为空
        if(obj == null){
            return false;
        }
        if(obj instanceof Person){
            *//*增加一个判断，判断是否为Person,防止类型转换异常.*//*
            *//*使用向下转型。把Object类型转换为Person。*//*
            Person p = (Person)obj;
            //比较两个对象的属性;一个是调用方法的this(p1),一个就是p2
            return this.name.demo02equals(p.name) && this.age == p.age;
            //为什么this不需要向下转型呢？
            //因为this本来就是p1哇，它不需要进行转型了啊，想一想。
            //传递进来的p2为什么需要转型呢？
            //因为它被Object obj这个类型给向上转型了。所以需要向下转型才能实现比较。
        }
        return false;
    }*/
    //
    /*@Override//对Object类的toString方法进行重写。
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
}
