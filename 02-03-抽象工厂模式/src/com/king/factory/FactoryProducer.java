package com.king.factory;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:08
 * Declaration: All Rights Reserved !!!
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice == null) {
            return null;
        }

        choice = choice.toUpperCase();

        switch (choice) {
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
            default:
                return null;
        }
    }
}
