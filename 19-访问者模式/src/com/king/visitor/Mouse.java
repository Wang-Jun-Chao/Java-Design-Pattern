package com.king.visitor;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 13:48
 * Declaration: All Rights Reserved !!!
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
