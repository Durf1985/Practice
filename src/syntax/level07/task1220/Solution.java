package syntax.level07.task1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
•	Переставить M первых строк в конец списка.
•	Выведи список на экран, каждое значение с новой строки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        for (String s :
                list) {
            System.out.println(s);
        }

        //напишите тут ваш код
    }
}