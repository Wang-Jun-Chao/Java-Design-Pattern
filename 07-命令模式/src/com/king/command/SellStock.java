package com.king.command;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 17:04
 * Declaration: All Rights Reserved !!!
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
