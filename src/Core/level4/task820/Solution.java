package Core.level4.task820;

/*
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.

Требования:
•	Программа должна считывать с клавиатуры 2 строки.
•	В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
•	Программа должна выводить данные на экран.
•	Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        if (a <= 0) throw new Exception();
        if (b <= 0) throw new Exception();
        System.out.println(nod(a, b));
        reader.close();
    }

    public static int nod(double a, double b) {
        int nod = 1; // честно списал аллгоритм и забыл. Чтобы заново не доказывать математическую теорему.
        for (int i = 1; i <= (a < b ? a : b); i++) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}
