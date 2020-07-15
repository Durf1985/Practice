package syntax.level04.task618;

/*
Минимум двух чисел
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран минимальное из двух целых чисел.
•	Если два числа равны между собой, необходимо вывести любое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Math.min(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
        reader.close();
        // Math.min работает по принципу если число (а>=b), а не (a>b)   Т.е в случае равенства будет
        // напечатано любое из них
    }
}
