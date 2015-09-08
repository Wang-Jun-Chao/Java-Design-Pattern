package com.king.factory;

import com.king.product.Circle;
import com.king.product.Rectangle;
import com.king.product.Shape;
import com.king.product.Square;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 09:53
 * Declaration: All Rights Reserved !!!
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        switch (shapeType) {
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
