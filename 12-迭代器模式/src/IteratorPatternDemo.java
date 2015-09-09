import com.king.iterator.Iterator;
import com.king.iterator.NameRepository;

/**
 * Author: 王俊超
 * Date: 2015-09-09
 * Time: 10:59
 * Declaration: All Rights Reserved !!!
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
