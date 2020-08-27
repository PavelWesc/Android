/* 
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) throws IOException {
            try {
                FileWriter writer = new FileWriter("C://Java/test.txt");
                writer.write("5 8 -2 11 3 15 2 10");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedReader reader = new BufferedReader(new FileReader(new File("C://Java/test.txt")));

            reader.lines()
                    .flatMap(x -> Arrays.stream(x.split(" ")))
                    .map(Integer::parseInt)
                    .filter(x -> x % 2 == 0)
                    .sorted()
                    .forEach(System.out::println);
            reader.close();
        }}
