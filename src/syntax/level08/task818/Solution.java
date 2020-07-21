package syntax.level08.task818;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу:
 "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String,
 Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
•	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        int salary = 300;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("" + i, salary);
            salary += 50;
        }
        System.out.println(map.entrySet());
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair :
                copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
        System.out.println(map.entrySet());
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
    }
}
