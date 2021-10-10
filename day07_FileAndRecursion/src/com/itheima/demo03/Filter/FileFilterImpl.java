package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FileFilter;
/*
    创建过滤器FileFilter 的实现类，重写过滤方法accept ，定义过滤规则。
*/
public class FileFilterImpl implements FileFilter {
    /*
        判断File 对象是否是以.java 结尾，是true 否false
    */
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().toLowerCase().endsWith(".java");
//        return true;
    }
}
