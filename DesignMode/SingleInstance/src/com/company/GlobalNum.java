package com.company;

/**
 * 饿汉式单例类
 */
public class GlobalNum {
    //实例化
    private static GlobalNum globalNum = new GlobalNum();

    //私有构造方法
    private GlobalNum() {}

    private int num = 0;

    //返回方法
    public static GlobalNum getInstance() {
        return globalNum;
    }

    public synchronized int getNum() {
        return ++num;
    }

}
