/*
Перед решением прочтите https://www.codeflow.site/ru/article/java-buffered-reader
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) throws IOException {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                HashMap<String, String> map = new HashMap<>();
                while (true) {
                    String city = reader.readLine();
                    if (city==null||city.isEmpty()) break;
                    String family = reader.readLine();

                    map.put(city, family);
                }
                String search = reader.readLine();
                System.out.println(map.get(search));
            }
        }
