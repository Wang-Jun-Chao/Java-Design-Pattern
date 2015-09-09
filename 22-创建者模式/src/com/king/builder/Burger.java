package com.king.builder;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 20:19
 * Declaration: All Rights Reserved !!!
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
