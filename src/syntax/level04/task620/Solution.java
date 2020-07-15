package syntax.level04.task620;

/*
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить три числа разделенных пробелами.
•	Программа должна выводить числа в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[3];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
//        for (int i = 0; i < list.length; i++) {
//            for (int j = i+1; j <list.length ; j++) {
//                if (list[i] > list[j]) {
//                    int a = list[i];
//                    list[i] = list[j];
//                    list[j] = a;
//                }
//
//            }
//        }

        Arrays.sort(list); // можно использовать аллгоритм пузырьковой сортировки указанный выше, но...
        // нафиг он не нужен из-за своего плохого времени выполнения, написал его здесь, только чтобы убедиться - помню.


        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
