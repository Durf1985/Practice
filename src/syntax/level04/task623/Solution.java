package syntax.level04.task623;

/*
Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".

Требования:
•	Программа должна считывать строки c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
•	Если возраст меньше либо равно 20 ничего не выводить.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
