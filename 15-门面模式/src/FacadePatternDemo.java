import com.king.facade.ShapeMaker;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:33
 * Declaration: All Rights Reserved !!!
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
