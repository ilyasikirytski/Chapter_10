package B_5;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStructure extends ArrayList<Integer> {
    public Integer findMostCloseNumber(Integer number) {
        Iterator<Integer> iterator = iterator();
        Integer min = iterator.next();

        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            if (Math.abs(elem - number) < Math.abs(min - number)) {
                min = elem;
            }
        }
        return min;
    }
}
