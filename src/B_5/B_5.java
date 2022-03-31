/*
На базе коллекций реализовать структуру хранения чисел с поддержкой
следующих операций:
• добавление/удаление числа;
• поиск числа, наиболее близкого к заданному (т. е. модуль разницы минимален).
 */
package B_5;

/*
создать свою структуру
измненить добавление элементов.
 */
public class B_5 {
    public static void main(String[] args) {
        MyStructure myStructure = new MyStructure();
        for (int i = 0; i < 10; i++) {
            myStructure.myList.add((int) (Math.random() * 100));
        }
        System.out.println(myStructure.findMostCloseNumber(5));
        System.out.println(myStructure.myList);
        myStructure.remove(3);
        System.out.println(myStructure.myList);
    }
}
