import com.king.singleton.Singleton;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 09:46
 * Declaration: All Rights Reserved !!!
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.operate();
    }
}
