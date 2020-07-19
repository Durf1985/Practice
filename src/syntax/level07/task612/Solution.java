package syntax.level07.task612;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
•	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
•	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
•	Должна быть выведена только одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int min = 0;
        for (int i = 0; i < 3; i++) {
            list.add(reader.readLine());
            int testmin = list.get(i).length();
            if (i == 0) {
                min = list.get(i).length();
            } else if (testmin < min) {
                min = testmin;
            }
            if (max < list.get(i).length()) {
                max = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max || list.get(i).length() == min) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
// мда, рубрика - опять смотрю на свое старое решение и даже понять не могу что я делал и зачем я так делал???
// ну ладно, вообще все понятно, но слишком переусложнено. И надо над названиями переменных поработать.
/*public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(reader.readLine());
        }
        String large = array.get(0);
        String small = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            String test = array.get(i);
            if (test.length() > large.length()) large = test;
            if (test.length() < small.length()) small = test;
        }
        int li = 0;
        int si = 0;
        for (int i = 0; i < array.size(); i++) {
            String test = array.get(i);
            if (test.length() == small.length()) {
                si = i;
                break;
            }
        }
        for (int i = 0; i < array.size(); i++) {
            String test = array.get(i);
            if (test.length() == large.length()) {
                li = i;
                break;
            }
        }
        if (li > si) {
            System.out.println(array.get(si));
        } else System.out.println(array.get(li));
    }
}
*/
