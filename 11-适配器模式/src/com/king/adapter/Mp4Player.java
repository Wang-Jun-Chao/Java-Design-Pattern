package com.king.adapter;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:26
 * Declaration: All Rights Reserved !!!
 */
public class Mp4Player  implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
