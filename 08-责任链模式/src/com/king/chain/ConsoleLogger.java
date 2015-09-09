package com.king.chain;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 18:35
 * Declaration: All Rights Reserved !!!
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
