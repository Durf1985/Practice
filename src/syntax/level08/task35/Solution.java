package syntax.level08.task35;

import java.util.HashMap;
import java.util.Map;

/*
На экране — значения!
Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.

Требования:
•	Программа должна создавать переменную коллекции Map с типом элементов String, String. Переменная должна быть сразу проинициализирована.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна добавлять в коллекцию 10 различных строк, согласно условию.
•	Метод printValues() должен выводить на экран список значений коллекции, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            System.out.println(pair.getValue());

        }
    }
}
