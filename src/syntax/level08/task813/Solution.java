package syntax.level08.task813;

/*
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
•	Не изменяй заголовок метода createSet().
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
•	Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<String> createSet() {
        Set<String> list = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            list.add("Л" + i);
        }

        return list;
    }

    public static void main(String[] args) {
//        Set<String> list = createSet();
//        System.out.println(list);
    }
}
