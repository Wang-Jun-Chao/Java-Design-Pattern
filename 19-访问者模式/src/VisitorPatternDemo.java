import com.king.visitor.Computer;
import com.king.visitor.ComputerPart;
import com.king.visitor.ComputerPartDisplayVisitor;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 13:50
 * Declaration: All Rights Reserved !!!
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

