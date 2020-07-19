package syntax.level07.task41;

/*
Массивный максимум
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива

Требования:
•	Метод initializeArray должен создавать массив из 20 целых чисел.
•	Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
•	Метод max должен возвращать максимальный элемент из переданного массива.
•	Метод main изменять нельзя.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        return ints;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int a :
                array) {
            if (a > max) {
                max = a;
            }
        }
// можно отсортировать массив и взять последний элемент.
        return max;
    }
}
