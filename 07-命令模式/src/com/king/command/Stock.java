package com.king.command;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 17:00
 * Declaration: All Rights Reserved !!!
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + "]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + "]sold ");
    }
}
