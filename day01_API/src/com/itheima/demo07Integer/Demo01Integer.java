package com.itheima.demo07Integer;

/*
    装箱：把基本类型的数据，包装到包装类中（基本类型的数据->包装类）
        构造方法：
            1.public Integer(int value)构造一个新分配的 Integer 对象，它表示指定的 int 值。
            2.public Integer(String s) throws NumberFormatException
                构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
                使用与 parseInt 方法（对基数为 10 的值）相同的方式将该字符串转换成 int 值。
                    转递的字符串，必须是基本类型的字符串，否则会抛出异常"100"正确"a"抛异常
        静态方法：
            public static Integer valueOf(int i)
                返回一个表示指定的 int 值的 Integer 实例。
            public static Integer valueOf(String s)
               throws NumberFormatException返回保存指定的 String 的值的 Integer 对象。
    拆箱：
        在包装类中取出基本类型的数据（包装类->基本类型的数据）
        成员方法：
            int intValue() 以int类型返回该 Integer的值

*/
public class Demo01Integer {
    public static void main(String[] args) {
        //1.装箱-- 基本类型到包装类
        //构造方法创建包装类对象
        Integer integer = new Integer(1);
        System.out.println(integer);//1 重写了toString方法

        Integer integer1 = new Integer("23");
        System.out.println(integer1); //23
        //静态方法创建包装类对象
        Integer integer2 = Integer.valueOf("12345");
        System.out.println(integer2);//12345

        //2.拆箱-- 包装类到基本类型
        //选择一个包装类，如integer
        int i = integer.intValue();
        /*int j = integer;*/
        System.out.println(i);//1
    }
}
