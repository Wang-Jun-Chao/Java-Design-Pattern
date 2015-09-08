package com.king.singleton;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 09:39
 * Declaration: All Rights Reserved !!!
 */
public class Singleton {
    /**
     * 单例对象
     */
    private final static Singleton INSTANCE = new Singleton();

    /**
     * 私有构造方法，保证不被不被new实例
     */
    private Singleton() {

    }

    /**
     * 获取单例的方法
     *
     * @return 单例对象
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }

    /**
     * 具体方法
     */
    public void operate() {
        System.out.println("进行某些操作");
    }
}
