package com.king.state;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:47
 * Declaration: All Rights Reserved !!!
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
