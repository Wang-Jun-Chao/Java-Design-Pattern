package com.king.factory;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 10:40
 * Declaration: All Rights Reserved !!!
 */
public class FactoryC extends AbstractFactory {
    @Override
    public AbstractProduct create() {
        return new ProductC();
    }
}
