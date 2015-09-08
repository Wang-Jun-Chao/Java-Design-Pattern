package com.king.factory;

import com.king.product.*;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:06
 * Declaration: All Rights Reserved !!!
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        color = color.toUpperCase();

        switch (color) {
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
