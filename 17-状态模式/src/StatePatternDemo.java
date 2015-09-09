import com.king.state.Context;
import com.king.state.StartState;
import com.king.state.StopState;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 19:47
 * Declaration: All Rights Reserved !!!
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
