package A_3;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
3. Создать в стеке индексный массив для быстрого доступа к записям в бинарном файле.
 */
public class A_3 {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();
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
                        myStack.insert(s);
                    }
                }
            }
            dataInputStream.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        myStack.remove("ilya");
        myStack.remove(3);
        for (String s : myStack) {
            System.out.println(s);
        }
        System.out.println(myStack.size());
    }
}

