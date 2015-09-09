import com.king.stategy.Context;
import com.king.stategy.OperationAdd;
import com.king.stategy.OperationMultiply;
import com.king.stategy.OperationSubstract;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:12
 * Declaration: All Rights Reserved !!!
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
