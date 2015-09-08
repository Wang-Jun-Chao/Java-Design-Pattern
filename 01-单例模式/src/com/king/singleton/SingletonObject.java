package com.king.singleton;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 09:39
 * Declaration: All Rights Reserved !!!
 */
public class SingletonObject {
    /**
     * 单例对象
     */
    private final static SingletonObject INSTANCE = new SingletonObject();

    /**
     * 私有构造方法，保证不被不被new实例
     */
    private SingletonObject() {

    }

    /**
     * 获取单例的方法
     *
     * @return 单例对象
     */
    public static SingletonObject getInstance() {
        return INSTANCE;
    }

    /**
     * 具体方法
     */
    public void showMessage() {
        System.out.println("进行某些操作");
    }
}
