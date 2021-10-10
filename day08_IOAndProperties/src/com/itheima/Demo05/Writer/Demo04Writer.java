package com.itheima.Demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
    续写，追加写：使用两个参数构造方法
        FileWriter(String fileName, boolean append)
        FileWriter(File file, boolean append)
        参数：
            String fileName, File file: 写入数据的目的地
            boolean append: 续写开关 true - 续写
    换行：
        windows : \r\n
        linux: /n
        mac : /r
*/
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day08_IOAndProperties\\src\\com\\itheima\\Demo05\\Writer\\a.txt",true);
        fw.write("\r\n追加的内容！");
        fw.close();
    }
}
