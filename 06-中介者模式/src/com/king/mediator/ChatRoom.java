package com.king.mediator;

import java.util.Date;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:49
 * Declaration: All Rights Reserved !!!
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
