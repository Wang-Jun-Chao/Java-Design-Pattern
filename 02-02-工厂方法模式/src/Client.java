import com.king.factory.FactoryA;
import com.king.factory.FactoryB;
import com.king.factory.FactoryC;
import com.king.product.AbstractProduct;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 10:42
 * Declaration: All Rights Reserved !!!
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(getProduct(1));
        System.out.println(getProduct(2));
        System.out.println(getProduct(3));
        System.out.println(getProduct(4));
    }

    public static AbstractProduct getProduct(int type) {
        switch (type) {
            case 1:
                return new FactoryA().create();
            case 2:
                return new FactoryB().create();
            case 3:
                return new FactoryC().create();
            default:
                return null;
        }
    }
}
