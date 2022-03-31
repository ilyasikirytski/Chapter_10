/*
В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета
по кругу вычеркивается каждый второй человек, пока не останется один.
Составить две программы, моделирующие процесс. Одна из программ
должна использовать класс ArrayList, а вторая — LinkedList. Какая из двух
программ работает быстрее? Почему?
 */
package B_1;

import java.util.LinkedList;

public class B_1_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> persons = new LinkedList<>();
        int listSize = 10;
        for (int i = 1; i <= listSize; i++) {
            persons.add(i);
        }
        System.out.println(persons);

        while (persons.size() > 1) {
            for (int i = 0; i < persons.size(); i++) {
                if (i % 2 == 1) {
                    persons.remove(i);
                    System.out.println(persons);
                }
            }
        }
    }
}
