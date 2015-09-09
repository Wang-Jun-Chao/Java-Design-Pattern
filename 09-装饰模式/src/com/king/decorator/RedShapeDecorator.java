package com.king.decorator;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:04
 * Declaration: All Rights Reserved !!!
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
