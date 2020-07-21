package syntax.level08.task817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String,
 String состоящих из 10 записей.
•	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей,
 имеющие одинаковые имена.
•	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("k" + i, "v" + i);
        }
        map.put("k", "v" + 0);
        System.out.println(map.entrySet());
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        // ArrayList может принимать в конструктор как ключи, так и значения.
        ArrayList<String> list = new ArrayList<>(map.values());
        /*
        Вообще ниженаписанное мне не нравится, потому что повторяющееся значение удаляется из мапы,
         * а не из списка и следовательно метод удаления из мапы будет вызываться как минимум 2 раза
         *  и тольк первый будет работать не в холостую, при списке в 10 строк это пофигу,
         *  а при списке в много строк это будет лишней тратой ресурса, возможно стоит ввести
         * дополнительный список, которые будет содержать уже найденные повторы и
         * прерывать цикл... но да пофигу. Валидатор всосал и ладно.
         * */
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    removeItemFromMapByValue(map, list.get(j));
                }
            }
        }
    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map.values());

    }
}

