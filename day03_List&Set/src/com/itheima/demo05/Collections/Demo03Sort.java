package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list,Comparator<? super T> ): 将集合中元素按照指定规则排序。

    Comparator和Comparable的区别
        Comparable: 自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较规则compareTo方法
        Comparator: 相当于找一个第三方的裁判，比较两个。
    Comparator的排序规则：
        o1 - o2 : 升序
        反之降序。
*/
public class Demo03Sort {
    public static void main(String[] args) {
//        test01();
        test02();
    }

    private static void test02() {
        //1.创建一个学生集合
        ArrayList<Student> studentArrayList = new ArrayList<>();
        //添加学生
        Student stu1 = new Student("a迪丽热巴", 18);
        Student stu2 = new Student("古力娜扎", 20);
        Student stu3 = new Student("杨幂", 17);
        Student stu4 = new Student("b杨幂", 18);
        studentArrayList.add(stu1);
        studentArrayList.add(stu2);
        studentArrayList.add(stu3);
        studentArrayList.add(stu4);
        System.out.println(studentArrayList);
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getAge() - o1.getAge();//升序
                if(result == 0){
                    result = o2.getName().charAt(0) - o1.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(studentArrayList);
    }

    private static void test01() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        System.out.println(arrayList);//[1, 3, 2]
        //【扩展】--了解即可。
        Collections.sort(arrayList, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2; //升序。
                return o2 - o1;
            }
        });
        System.out.println(arrayList);//[3, 2, 1]
    }
}
