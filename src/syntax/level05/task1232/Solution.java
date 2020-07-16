package syntax.level05.task1232;

/*
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	Программа должна выводить число на экран.
•	В классе должен быть метод public static void main.
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить на экран максимальное из введенных N чисел.
•	Программа не должна ничего выводить на экран, если N меньше либо равно 0.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = 0;
        if (N > 0) {
            int[] list = new int[N];
            for (int i = 0; i < list.length; i++) {
                list[i] = Integer.parseInt(reader.readLine());
                if (list[i] > maximum) {
                    maximum = list[i];
                }
            }
        }
        //напишите тут ваш код
        System.out.println(maximum);
    }
}
