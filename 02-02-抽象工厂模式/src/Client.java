import com.king.product.*;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 10:50
 * Declaration: All Rights Reserved !!!
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(getProductA(1));
        System.out.println(getProductA(2));
        System.out.println(getProductA(3));
        System.out.println(getProductA(4));

        System.out.println(getProductB(1));
        System.out.println(getProductB(2));
        System.out.println(getProductB(3));
        System.out.println(getProductB(4));
    }

    public static AbstractProductA getProductA(int type) {
        switch (type) {
            case 1:
                return new ProductA1();
            case 2:
                return new ProductA2();
            case 3:
                return new ProductA3();
            default:
                return null;
        }
    }

    public static AbstractProductB getProductB(int type) {
        switch (type) {
            case 1:
                return new ProductB1();
            case 2:
                return new ProductB2();
            case 3:
                return new ProductB3();
            default:
                return null;
        }
    }
}
