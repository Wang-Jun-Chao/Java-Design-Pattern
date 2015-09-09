package com.king.memento;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:37
 * Declaration: All Rights Reserved !!!
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
