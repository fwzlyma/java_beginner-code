package com.itheima.demo03.ObjectStream;

import java.io.Serializable;
import java.util.Objects;

/*
    static关键字：静态关键字
        静态优先于非静态加载到内存中--静态优先于对象进入到内存中
        被static 修饰的成员变量不能被序列化的，序列化的都是对象
    transient 关键字：瞬态关键字
        被transient 关键字修饰的成员变量，不能被序列化
        private transient int age;
        oos.writeObject(new Person("迪丽热巴",20));
        Object o = ois.readObject();
        Person{name = "迪丽热巴",age = 0}
 */
public class Person implements Serializable{
    // 要序列化、反序列化的时候，JVM分配一个Serializable 号码，如果先序列化、改变类内容（重新编号）、反序列化会出问题--Serializable 号码不一致
    // 因此可以 手动给类编号！
    private static final long serialVersionUID = 1L;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

        return Objects.hash(name, age);
    }
}
