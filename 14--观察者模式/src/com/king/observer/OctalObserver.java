package com.king.observer;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 14:21
 * Declaration: All Rights Reserved !!!
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
