package com.king.builder;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 20:21
 * Declaration: All Rights Reserved !!!
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
