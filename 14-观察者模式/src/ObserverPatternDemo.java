import com.king.observer.BinaryObserver;
import com.king.observer.HexaObserver;
import com.king.observer.OctalObserver;
import com.king.observer.Subject;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 14:23
 * Declaration: All Rights Reserved !!!
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
