package A_3;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

/*
3. Создать в стеке индексный массив для быстрого доступа к записям в бинарном файле.
 */
/*
так ведь у стека уже есть доступ быстрый доступ
по индексу доступ к элементам стека - get(5);
peak()
pop()
 */
public class A_3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        DataInputStream dataInputStream;
        byte[] readingBytes;
        try {
            dataInputStream = new DataInputStream(new FileInputStream(new File("C:\\Users\\Admin\\Desktop\\", "Chapter_10.dat")));
            while (dataInputStream.available() > 0) {
                readingBytes = dataInputStream.readAllBytes();
                String bytesByString = new String(readingBytes);
                StringBuilder convertBinaryToWord = new StringBuilder();
                String[] wordsFromFile = null;
                for (int i = 0; i < bytesByString.length() / 8; i++) {
                    int a = Integer.parseInt(bytesByString.substring(8 * i, (i + 1) * 8), 2);
                    convertBinaryToWord.append((char) (a));
                    wordsFromFile = convertBinaryToWord.toString().split(" ");
                }
                if (wordsFromFile != null) {
                    for (String s : wordsFromFile) {
                        stack.push(s);
                    }
                }
            }
            dataInputStream.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        stack.remove("ilya");
        System.out.println(stack.get(3));
        stack.remove(3);
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        System.out.println(stack.size());

        Iterator<String> stackIterator = stack.iterator();
        while (stackIterator.hasNext())
            System.out.println(stackIterator.next());
    }
}

