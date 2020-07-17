package syntax.level06.task1122;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17

Требования:
•	Программа должна считывать 5 чисел с клавиатуры.
•	Программа должна выводить 5 чисел, каждое с новой строки.
•	Выведенные числа должны быть отсортированы по возрастанию.
•	Вывод должен содержать те же числа, что и были введены (порядок не важен).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        // тут типа надо писать сортировку, предполагается что на этом уровне я знаю только пузырек, ну его нафиг...
        for (int a :
                list) {
            System.out.println(a);
        }

    }
}
