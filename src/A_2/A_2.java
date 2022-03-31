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
        Stack<Integer> numbers = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            String number = scanner.next();
            String digital;
            for (int i = 0; i < number.length(); i++) {
                digital = number.substring(i, i + 1);
                numbers.push(Integer.parseInt(digital));
            }
        }
        while (numbers.size() > 0) {
            System.out.print(numbers.pop());
        }
    }
}
