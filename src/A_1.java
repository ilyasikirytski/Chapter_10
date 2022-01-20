import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке
 */
public class A_1 {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<>();
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1;
            }
        };
        BufferedReader bf = null;
        Scanner scan = null;
        PrintWriter pw = null;
        try {
            bf = new BufferedReader(new FileReader(new File("C:\\Users\\Admin\\Desktop\\", "Chapter_8_input.txt")));
            scan = new Scanner(bf);
            pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("C:\\Users\\Admin\\Desktop\\", "Chapter_8_output.txt"))));
            while ((scan.hasNext())) {
                if (scan.hasNextLine()) {
                    listOfStrings.add(scan.nextLine());
                }
            }
            Collections.sort(listOfStrings, comp);
            for (String s : listOfStrings) {
                pw.println(s);
            }
            for (String s : listOfStrings) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bf != null) {
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (pw != null) {
                try {
                    pw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}