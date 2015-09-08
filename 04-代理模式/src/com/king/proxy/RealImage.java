package com.king.proxy;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:31
 * Declaration: All Rights Reserved !!!
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
