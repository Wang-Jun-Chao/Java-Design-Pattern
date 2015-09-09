package com.king.decorator;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:00
 * Declaration: All Rights Reserved !!!
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
