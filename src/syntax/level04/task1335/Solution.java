package syntax.level04.task1335;
/*
Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Каждое значение вывести с новой строки.

Требования:
•	Программа не должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить чётные числа от 1 до 100 включительно. Каждое значение вывести с новой строки.
•	В программе должен использоваться цикл for.
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}