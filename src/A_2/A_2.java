package A_2;/*
2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры
идут в обратном порядке.
 */
/*
разбить число на цифры, занести в стек. вывести в обратном порядке
peak(). pop()
 */

import java.util.Scanner;
import java.util.Stack;

public class A_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            String number = scanner.next();
            reverseNumber(number);
        }
    }

    public static void reverseNumber(String number) {
        Stack<Character> numbers = new Stack<>();
        for (int i = 0; i < number.length(); i++) {
            numbers.push(number.charAt(i));
        }
        while (numbers.size() > 0) {
            System.out.print(numbers.pop());
        }
    }
}
