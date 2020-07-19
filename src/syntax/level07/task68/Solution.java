package syntax.level07.task68;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
•	Программа должна выводить самую длинную строку на экран.
•	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxLenght = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (maxLenght < strings.get(i).length()) {
                maxLenght = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (maxLenght == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }
        // блин, каким местоя я думал, когда писал этот код???
        /* strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String test = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            String point = strings.get(i);
            if (test.length() < point.length()) {
                test = point;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            String out = strings.get(i);
            if (test.length() == out.length()) {
                System.out.println(out);
            }

        }*/
    }
}
