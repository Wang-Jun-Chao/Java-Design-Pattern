package com.king.builder;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 20:20
 * Declaration: All Rights Reserved !!!
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
