package com.king.factory;

import com.king.product.AbstractProductA;
import com.king.product.AbstractProductB;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 11:13
 * Declaration: All Rights Reserved !!!
 */
public abstract class AbstractFactory {

    public abstract AbstractProductA createA();
    public abstract AbstractProductB createB();

}
