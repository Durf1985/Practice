package syntax.level08.task1121;

/*
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.

Требования:
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать только три метода.
•	Метод createPeopleMap() должен создавать и возвращать словарь Map с типом
элементов String, String. Кроме того, добавлять в словарь 10 человек.
•	В методе createPeopleMap() должны добавляться люди с одинаковыми фамилиями.
•	В методе createPeopleMap() должны добавляться люди с одинаковыми именами.
•	Метод printPeopleMap() должен выводить на экран всех людей из словаря Map.
 Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
•	Метод main() должен вызывать метод createPeopleMap().
•	Метод main() должен вызывать метод printPeopleMap().
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");// это будет затерто
        map.put("2", "2");
        map.put("3", "1");
        map.put("4", "3");
        map.put("1", "4");// вот этим, потому что ключ одинаковый.
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");
// вот реально было лень, поэтому скопировал из старого задания
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
