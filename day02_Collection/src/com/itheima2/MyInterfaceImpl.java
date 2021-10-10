package com.itheima2;

public class MyInterfaceImpl<I> implements MyInterface<I> {
    @Override
    public void print(I i) {
        System.out.println(i);
    }
}
