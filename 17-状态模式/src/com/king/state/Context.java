package com.king.state;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:46
 * Declaration: All Rights Reserved !!!
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
