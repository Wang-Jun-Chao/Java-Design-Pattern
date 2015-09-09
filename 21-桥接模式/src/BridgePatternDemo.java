import com.king.bridge.Circle;
import com.king.bridge.GreenCircle;
import com.king.bridge.RedCircle;
import com.king.bridge.Shape;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 20:13
 * Declaration: All Rights Reserved !!!
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
