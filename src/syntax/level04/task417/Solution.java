package syntax.level04.task417;

/*
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести числа на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a == c && b == c) System.out.println(a + " " + b + " " + c);
        else if (a == b) System.out.println(a + " " + b);
        else if (b == c) System.out.println(b + " " + c);
        else if (a == c) System.out.println(a + " " + c);

    }
}
