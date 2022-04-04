package A_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Stack;

public class BinaryFileStack extends Stack<String> {
    BufferedReader bf;

    public BinaryFileStack(Path file) throws IOException {
        bf = new BufferedReader(new FileReader(String.valueOf(file)));
    }

    public void readAndPush() throws IOException {
        String bytesByString = bf.readLine();
        StringBuilder convertBinaryToWord = new StringBuilder();
        String[] wordsFromFile = null;
        for (int i = 0; i < bytesByString.length() / 8; i++) {
            int a = Integer.parseInt(bytesByString.substring(8 * i, (i + 1) * 8), 2);
            convertBinaryToWord.append((char) (a));
            wordsFromFile = convertBinaryToWord.toString().split(" ");
        }
        if (wordsFromFile != null) {
            for (String s : wordsFromFile) {
                push(s);
            }
        }
    }
}
