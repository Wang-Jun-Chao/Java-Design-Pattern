package com.king.state;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:46
 * Declaration: All Rights Reserved !!!
 */
public class StartState implements State{
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
