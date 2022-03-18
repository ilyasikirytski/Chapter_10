/*
На базе коллекций реализовать структуру хранения чисел с поддержкой
следующих операций:
• добавление/удаление числа;
• поиск числа, наиболее близкого к заданному (т. е. модуль разницы минимален).
 */
package B_5;

import java.util.ArrayList;
import java.util.Iterator;

public class B_5 {

    private static final ArrayList<Integer> myList = new ArrayList<>();

    public static void main(String[] args) {
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(1);
        myList.add(9);
        myList.add(20);
        myList.add(30);
        System.out.println(find(14));

    }

    public static Integer find(Integer number) {
        Iterator<Integer> iterator = myList.iterator();
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
