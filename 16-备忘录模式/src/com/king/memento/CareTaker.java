package com.king.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:38
 * Declaration: All Rights Reserved !!!
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
