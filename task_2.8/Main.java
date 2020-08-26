/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

public class Main {
   public static void main(String[] args) {
            int a;
            int b;
            for (a = 0; a < 10; a++) {
                System.out.println();
                for (b = 0; b <= a; b++)
                    System.out.print("8");

            }
        }
    }
