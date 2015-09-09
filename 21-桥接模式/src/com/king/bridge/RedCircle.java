package com.king.bridge;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 20:09
 * Declaration: All Rights Reserved !!!
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}