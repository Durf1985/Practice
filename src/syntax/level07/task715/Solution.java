package syntax.level07.task715;

/*
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Добавь в список слова: «мама», «мыла», «раму».
•	После каждого слова добавь в список строку, содержащую слово «именно».
•	Выведи элементы списка на экран, каждый с новой строки.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                list.add(i, "именно");
            }
        }
        for (String s :
                list) {
            System.out.print(s + " ");
        }
    }
}
/*     ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).equals("мама")|| list.get(i).equals("мыла")|| list.get(i).equals("раму"))
                list.add(i+1,"именно");
        }
        for (String out : list ) {
            System.out.println(out);
        }
    }*/
