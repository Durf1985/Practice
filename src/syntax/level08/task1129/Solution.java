package syntax.level08.task1129;

/*
Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать три метода.
•	Метод main() должен вызывать метод sort().
•	Метод sort() должен вызывать метод isGreaterThan().
	Выведенные слова должны быть отсортированы в алфавитном порядке.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        isGreaterThan(array[0], array[1]);
        // тут должно быть что-то вроде этого, но идите лесом со своими пузырьками
        /*   for (int i = array.length-1; i >0; i--) {
          for (int j = 0; j<i; j++ )
           if (isGreaterThan(array[j],array[j+1])) {
                String tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
            }
        }*/
    }


    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
