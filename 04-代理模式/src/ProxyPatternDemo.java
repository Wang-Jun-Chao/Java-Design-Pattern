import com.king.proxy.Image;
import com.king.proxy.ProxyImage;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:33
 * Declaration: All Rights Reserved !!!
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();

        System.out.println("");
        image.display();

        System.out.println();
        image = new ProxyImage(null);
        image.display();
    }
}
