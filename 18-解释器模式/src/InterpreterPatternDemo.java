import com.king.interpreter.AndExpression;
import com.king.interpreter.Expression;
import com.king.interpreter.OrExpression;
import com.king.interpreter.TerminalExpression;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:54
 * Declaration: All Rights Reserved !!!
 */
public class InterpreterPatternDemo {
    // 规则： Robert 和 John 都是男的
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    // 规则: Julie 是已婚女人
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
