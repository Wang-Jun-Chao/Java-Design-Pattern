package com.king.template;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:19
 * Declaration: All Rights Reserved !!!
 */
public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
