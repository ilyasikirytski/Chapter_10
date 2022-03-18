/*
Задан список целых чисел и число X.
Не используя вспомогательных объектов и не изменяя размера списка,
переставить элементы списка так, чтобы сначала шли числа,
не превосходящие X, а затем числа, больше X.
 */
package B_2;

import java.util.ArrayList;

public class B_2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(-14);
        integers.add(1);
        integers.add(22);
        integers.add(5);
        integers.add(30);
        integers.add(-44);
        integers.add(3);
        integers.add(40);
        integers.add(4);
        integers.add(-4);
        integers.add(-54);
        System.out.println(integers);

        for (int i = 1; i < integers.size(); i++)
            for (int j = integers.size() - 1; j >= i; --j) {
                if (integers.get(j - 1) > integers.get(j)) {
                    integers.set(j - 1, integers.get(j - 1) + integers.get(j));
                    integers.set(j, integers.get(j - 1) - integers.get(j));
                    integers.set(j - 1, integers.get(j - 1) - integers.get(j));
                }
            }
        System.out.println(integers);
    }
}
