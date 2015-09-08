package com.king.template;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:22
 * Declaration: All Rights Reserved !!!
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
