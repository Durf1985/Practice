package syntax.level07.task1228;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
В убывающем порядке
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

Требования:
•	Программа должна считывать 20 целых чисел с клавиатуры.
•	Программа должна выводить 20 чисел.
•	В классе Solution должен быть метод public static void sort(int[] array).
•	Метод main должен вызывать метод sort.
•	Метод sort должен сортировать переданный массив по убыванию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        // Забавно, повторно я не смог придумать этот способ. при умножении на -1 самое
        // большое число становится самым маленьким следовательно если отсортировать
        // по возрастанию, а после опять поменять знак, то массив будет отсортирован по убыванию
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }


    }
}
