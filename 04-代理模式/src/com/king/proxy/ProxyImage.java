package com.king.proxy;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:32
 * Declaration: All Rights Reserved !!!
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
