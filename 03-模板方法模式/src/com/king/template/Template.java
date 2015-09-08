package com.king.template;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 11:52
 * Declaration: All Rights Reserved !!!
 */
public abstract class Template {

    public void templateMethod() {
         subMethod();
    }

    protected abstract void subMethod();
}
