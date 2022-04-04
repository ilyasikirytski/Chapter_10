package A_3;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
3. Создать в стеке индексный массив для быстрого доступа к записям в бинарном файле.
 */
/*
так ведь у стека уже есть доступ быстрый доступ
по индексу доступ к элементам стека - get(5);
peak()
pop()
 */
/*
создать кастомный стек binaryFileStack в который я передаю название файла, а дальше он внутри считывает этот файл и создает
 массив данных. И методами get() я получаю данные из этого массива.
 ---
 получить пятый байт из массива байтов.
 binaryFileStack.getByte(5);
 возваращает байт
 */
public class A_3 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get(System.getenv("USERPROFILE") + "\\Desktop\\Chapter_10.dat");
        BinaryFileStack binaryFileStack = new BinaryFileStack(file);
        binaryFileStack.readAndPush();

        System.out.println(binaryFileStack.size());
        binaryFileStack.remove("ilya");
        System.out.println(binaryFileStack.get(3));
        binaryFileStack.remove(3);
        for (String s : binaryFileStack) {
            System.out.println(s);
        }
    }
}

