package com.king.memento;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:37
 * Declaration: All Rights Reserved !!!
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
