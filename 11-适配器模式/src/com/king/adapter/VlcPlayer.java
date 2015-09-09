package com.king.adapter;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:25
 * Declaration: All Rights Reserved !!!
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
