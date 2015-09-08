package com.king.template;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:20
 * Declaration: All Rights Reserved !!!
 */
public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
