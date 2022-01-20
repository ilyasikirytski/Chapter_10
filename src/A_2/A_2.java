package A_2;/*
2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры
идут в обратном порядке.
 */

import java.util.Scanner;
import java.util.Stack;

public class A_2 {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            numbers.push(scanner.nextInt());
        }
        for (Integer i : numbers) {
            String reverse = new StringBuffer(i.toString()).reverse().toString();
            if (i > Integer.parseInt(reverse)) {
                System.out.println(i);
            }
        }
    }
}
