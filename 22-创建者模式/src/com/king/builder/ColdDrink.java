package com.king.builder;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 20:20
 * Declaration: All Rights Reserved !!!
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
