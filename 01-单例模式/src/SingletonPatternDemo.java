import com.king.singleton.SingletonObject;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 09:46
 * Declaration: All Rights Reserved !!!
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonObject singleton = SingletonObject.getInstance();
        singleton.showMessage();
    }
}
