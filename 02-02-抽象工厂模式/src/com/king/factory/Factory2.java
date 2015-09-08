package com.king.factory;

import com.king.product.AbstractProductA;
import com.king.product.AbstractProductB;
import com.king.product.ProductA2;
import com.king.product.ProductB2;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 11:17
 * Declaration: All Rights Reserved !!!
 */
public class Factory2 extends AbstractFactory {
    @Override
    public AbstractProductA createA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createB() {
        return new ProductB2();
    }
}
