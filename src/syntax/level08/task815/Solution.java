package syntax.level08.task815;


/*
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String,
String состоящих из 10 записей по принципу «Фамилия» - «Имя».
•	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
•	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("key" + i, "value" + i);
        }
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            String firstName = pair.getValue();
            if (firstName.equals(name)) {
                count++;
            }
        }

        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            String lName = pair.getKey();
            if (lName.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
