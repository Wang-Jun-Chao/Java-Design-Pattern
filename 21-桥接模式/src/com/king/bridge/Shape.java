package com.king.bridge;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 20:08
 * Declaration: All Rights Reserved !!!
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
