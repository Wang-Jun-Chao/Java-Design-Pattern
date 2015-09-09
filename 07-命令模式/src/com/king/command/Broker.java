package com.king.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 17:05
 * Declaration: All Rights Reserved !!!
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
