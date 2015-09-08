package com.king.factory;

import com.king.product.*;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:05
 * Declaration: All Rights Reserved !!!
 */
public class ShapeFactory  extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }

        shape = shape.toUpperCase();

        switch (shape) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
