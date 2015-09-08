package com.king.mediator;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:49
 * Declaration: All Rights Reserved !!!
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
