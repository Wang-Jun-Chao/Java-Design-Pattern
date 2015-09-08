import com.king.template.Cricket;
import com.king.template.Football;
import com.king.template.Game;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 16:23
 * Declaration: All Rights Reserved !!!
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
