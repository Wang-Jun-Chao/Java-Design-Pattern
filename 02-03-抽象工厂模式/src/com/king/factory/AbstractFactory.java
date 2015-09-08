package com.king.factory;

import com.king.product.Color;
import com.king.product.Shape;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 11:13
 * Declaration: All Rights Reserved !!!
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
