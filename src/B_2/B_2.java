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
        int x = 30;
        integers.add(1);
        integers.add(22);
        integers.add(5);
        integers.add(30);
        integers.add(3);
        integers.add(40);
        integers.add(4);
        System.out.println(integers);

        int temp1 = integers.get(2);
        integers.set(2, integers.get(1));
        integers.set(1, temp1);
        System.out.println(integers);

        for (int i = 0; i < integers.size(); i++) {
            for (int j = 1; j < (integers.size() - i); j++) {
                if (integers.get(j - 1) > x) {
                    int temp = integers.get(j - 1);
                    integers.set(j - 1, integers.get(j));
                    integers.set(j, temp);
                }
            }
        }
        System.out.println(integers);
    }
}
