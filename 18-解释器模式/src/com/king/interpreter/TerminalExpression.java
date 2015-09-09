package com.king.interpreter;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:52
 * Declaration: All Rights Reserved !!!
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
