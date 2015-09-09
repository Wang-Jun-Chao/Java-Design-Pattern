import com.king.command.Broker;
import com.king.command.BuyStock;
import com.king.command.SellStock;
import com.king.command.Stock;

/**
 * Author: 王俊超
 * Date: 2015-09-08
 * Time: 17:07
 * Declaration: All Rights Reserved !!!
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
