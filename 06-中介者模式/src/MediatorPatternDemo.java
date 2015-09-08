import com.king.mediator.User;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:50
 * Declaration: All Rights Reserved !!!
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
