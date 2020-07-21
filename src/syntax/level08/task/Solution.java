package syntax.level08.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Модернизация ПО
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
Абрамовичи

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать один метод.
•	Программа должна вывести фамилию семьи по введенному городу.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            map.put(town, family);
        }
        String town = reader.readLine();
        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            if (town.equalsIgnoreCase(pair.getKey())) {
                System.out.println(pair.getValue());
            }
        }
    }

}


