package com.itheima.demo04.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    java.io.PrintStream 打印流
        PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
    PrintStream 特点：
        1.只负责数据的输出，不负责数据的读取
        2.与其他输出流不同，PrintStream 永远不会抛出 IOException
        3.有特有的方法，print , println
            void print(任意类型的值)
            void println(任意类型的值并换行)
    构造方法：
        PrintStream(File file) 创建具有指定文件且不带自动行刷新的新打印流。
            输出的目的地是一个文件
        PrintStream(OutputStream out) 创建新的打印流。
            输出的目的地是一个字节输入流
        PrintStream(String fileName) 创建具有指定文件名称且不带自动行刷新的新打印流。
            输出目的地是一个文件路径
    PrintStream extends OutputStream
    继承自父类的成员方法：
        public void close() throws IOException关闭此输出流并释放与此流有关的所有系统资源。
        public void flush() throws IOException刷新此输出流，并强制将所有已缓冲的输出字节写入该流中。
        public void write(int b) throws IOException将指定 byte 写入此输出流。
        public void write(byte[] b) throws IOException将 b.length 个字节写入此输出流。
        public void write(byte[] b,
                  int off,
                  int len) throws IOException将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
        public abstract void write(int b) : 将指定的字节输入流。
    注意：
        如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表 97->a
        如果使用自己特有的方法print/println方法写数据，写的数据原样输出 97->97
*/
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建打印流PrintStream 对象，构造方法绑定要输出的目的地
        PrintStream ps = new PrintStream("day10_IO\\src\\com\\itheima\\demo04\\PrintStream\\out.txt");
        // 使用继承来的方法write -- 97->a
        ps.write(97);
        ps.println();
        ps.println(97);
        ps.println('a');
        ps.println(2.3);
        ps.println("JAVA");
        ps.println(true);
        // 释放资源
        ps.close();
    }
}
