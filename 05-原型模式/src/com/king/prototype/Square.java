package com.king.prototype;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:42
 * Declaration: All Rights Reserved !!!
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
