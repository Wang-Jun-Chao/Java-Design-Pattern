package com.king.factory;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 09:53
 * Declaration: All Rights Reserved !!!
 */
public class Factory {

     public static AbstractProduct create(int type) {
         switch (type) {
             case 1:
                 return new ProductA();
             case 2:
                 return new ProductB();
             case 3:
                 return new ProductC();
             default:
                 return null;
         }
     }
}
