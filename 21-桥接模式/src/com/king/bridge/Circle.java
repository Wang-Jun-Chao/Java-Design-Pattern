package com.king.bridge;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 20:12
 * Declaration: All Rights Reserved !!!
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
