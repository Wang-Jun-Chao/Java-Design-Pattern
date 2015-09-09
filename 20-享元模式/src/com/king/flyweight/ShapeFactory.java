package com.king.flyweight;

import java.util.HashMap;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:59
 * Declaration: All Rights Reserved !!!
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
