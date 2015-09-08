import com.king.factory.ShapeFactory;
import com.king.product.Shape;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 09:59
 * Declaration: All Rights Reserved !!!
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
