package com.king.visitor;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 13:45
 * Declaration: All Rights Reserved !!!
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
