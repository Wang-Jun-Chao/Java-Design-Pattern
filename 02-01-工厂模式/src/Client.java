import com.king.factory.Factory;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 09:59
 * Declaration: All Rights Reserved !!!
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Factory.create(1));
        System.out.println(Factory.create(2));
        System.out.println(Factory.create(3));
        System.out.println(Factory.create(4));
    }
}
