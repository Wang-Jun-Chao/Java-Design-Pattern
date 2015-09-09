package com.king.chain;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 18:35
 * Declaration: All Rights Reserved !!!
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
