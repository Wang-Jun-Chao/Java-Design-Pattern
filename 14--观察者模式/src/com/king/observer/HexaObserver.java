package com.king.observer;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 14:22
 * Declaration: All Rights Reserved !!!
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
