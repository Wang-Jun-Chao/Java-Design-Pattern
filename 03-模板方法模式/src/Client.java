import com.king.template.ConcreteA;
import com.king.template.ConcreteB;
import com.king.template.ConcreteC;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 11:58
 * Declaration: All Rights Reserved !!!
 */
public class Client {
    public static void main(String[] args) {
        new ConcreteA().templateMethod();
        new ConcreteB().templateMethod();
        new ConcreteC().templateMethod();
    }
}
