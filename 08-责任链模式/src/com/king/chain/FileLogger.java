package com.king.chain;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 18:36
 * Declaration: All Rights Reserved !!!
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
