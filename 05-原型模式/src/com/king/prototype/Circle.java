package com.king.prototype;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:43
 * Declaration: All Rights Reserved !!!
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
