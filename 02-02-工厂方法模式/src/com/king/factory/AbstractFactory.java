package com.king.factory;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 10:39
 * Declaration: All Rights Reserved !!!
 */
public abstract class AbstractFactory {
    /**
     * 工厂方法，创建产品
     *
     * @return 具体产品
     */
    public abstract AbstractProduct create();
}
