package com.king.prototype;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:41
 * Declaration: All Rights Reserved !!!
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
