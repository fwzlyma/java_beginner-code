package com.itheima.demo02.Set;

import java.util.Arrays;
import java.util.Objects;

public class Person extends Object {
    private String name;//姓名
    private int age;//年龄

    /*@Override
    public int hashCode() {
        return (this.name+ Integer.toString(this.age)).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //向下转型
        Person p = (Person)obj;
        if(this.name == p.name && this.age == p.age){
            return true;
        }
        return false;
    }*/

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
        //已经走过了hashCode那关，现在是需要equals判断，此时
        //如果你一直加这个对象，肯定看都不用看了，是不能加入集合的。
        if (this == o) return true;
        //判断o是否为null 、 如果类不对，防止下一句转换异常。
        if (o == null || getClass() != o.getClass()) return false;
        //走到这里不会异常。
        Person person = (Person) o;
        //同名同年龄的人，视为同一人，只能存储一次。
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        //和我想的一样
        return Objects.hash(name, age);
    }
}