package com.king.observer;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 14:19
 * Declaration: All Rights Reserved !!!
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
