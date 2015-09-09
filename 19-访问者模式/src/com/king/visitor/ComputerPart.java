package com.king.visitor;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 13:45
 * Declaration: All Rights Reserved !!!
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
