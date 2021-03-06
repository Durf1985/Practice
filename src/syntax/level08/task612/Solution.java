package syntax.level08.task612;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
•	Программа должна выводить число на экран.
•	Программа должна считывать значения с клавиатуры.
•	В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
•	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
•	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sequence = 1;
        int result = 1;
        for (int i = 0; i < 6; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                sequence++;
            } else if (!list.get(i).equals(list.get(i + 1))) {
                if (result < sequence) {
                    result = sequence;
                    sequence = 1;
                }
            }
        }
        if (result < sequence) {
            result = sequence;
        }
        System.out.println(result);
    }

}
// прошлый раз решил более изящно... взбодрись тряпка.
/* int count = 1;
        int max = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                if (max < count) {
                    max = count;
                }
            } else count = 1;
        }
        System.out.println(max);*/


