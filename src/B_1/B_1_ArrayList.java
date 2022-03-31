/*
В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета
по кругу вычеркивается каждый второй человек, пока не останется один.
Составить две программы, моделирующие процесс. Одна из программ
должна использовать класс ArrayList, а вторая — LinkedList. Какая из двух
программ работает быстрее? Почему?
 */
package B_1;

import java.util.ArrayList;
import java.util.Iterator;

/*
Размер массива в переменную
чем отлич. arrayList от linkedList
сложность операций - почит
 */
public class B_1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> persons = new ArrayList<>();
        int arraySize = 10;

        for (int i = 1; i <= arraySize; i++) {
            persons.add(i);
        }
        System.out.println(persons);

        while (persons.size() > 1) {
            Iterator<Integer> iterator = persons.iterator();
            for (int i = 0; iterator.hasNext(); i++, iterator.next()) {
                if (i % 2 == 1) {
                    iterator.remove();
                    System.out.println(persons);
                }
            }
        }
    }
}
