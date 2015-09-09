package com.king.stategy;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:11
 * Declaration: All Rights Reserved !!!
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
