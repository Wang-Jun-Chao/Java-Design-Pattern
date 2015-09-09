import com.king.adapter.AudioPlayer;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:34
 * Declaration: All Rights Reserved !!!
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
