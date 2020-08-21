package Core.level5.task1221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/*
Факториал
Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.

Пример вычислений: 4! = factorial(4) = 1*2*3*4
Пример вывода: 24

1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить на экран факториал введенного числа.
•	Метод factorial должен возвращать строковое представление факториала числа переданного ему в качестве параметра.
•	Метод factorial должен принимать один параметр типа int.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0) {
            return "0";
        }
        if (n == 0) {
            return "1";
        }
        BigDecimal bigDecimal= normalBigfactorial(n);

        return bigDecimal + "";
    }

    public static BigDecimal normalBigfactorial(int a) {
        if (a == 1) return new BigDecimal(1);
        return new BigDecimal(a).multiply(normalBigfactorial(a-1));
    }


}
