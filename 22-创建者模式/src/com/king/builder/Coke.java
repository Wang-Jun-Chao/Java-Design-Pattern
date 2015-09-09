package com.king.builder;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 20:21
 * Declaration: All Rights Reserved !!!
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
