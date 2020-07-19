package syntax.level07.task1221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
•	В классе Solution создай статический публичный метод int[] getInts().
•	Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
•	В методе main создай и проициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
•	Используй цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] list = getInts();
        int maximum = 0;
        int minimum = 0;
        int mintest;
        for (int i = 0; i < list.length; i++) {
            mintest = list[i];
            if (i == 0) {
                minimum = list[i];
            } else if (minimum > mintest) {
                minimum = mintest;
            }
            if (maximum < list[i]) {
                maximum = list[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }
}
