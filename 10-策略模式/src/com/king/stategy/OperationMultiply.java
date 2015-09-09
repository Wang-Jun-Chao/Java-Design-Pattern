package com.king.stategy;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:11
 * Declaration: All Rights Reserved !!!
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
