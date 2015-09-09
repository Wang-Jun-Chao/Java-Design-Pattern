import com.king.decorator.Circle;
import com.king.decorator.Rectangle;
import com.king.decorator.RedShapeDecorator;
import com.king.decorator.Shape;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:04
 * Declaration: All Rights Reserved !!!
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
