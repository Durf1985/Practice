package syntax.level08.task32;

/*
Map из 10 пар
Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень

Требования:
•	Объяви переменную коллекции Map с типом элементов String, String и сразу проинициализируй ee.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
•	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("ирис", "цветок");
        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
