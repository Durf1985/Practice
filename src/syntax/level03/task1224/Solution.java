package syntax.level03.task1224;

import java.util.Date;

/*
Сумма цифр трехзначного числа
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод sumDigitsInNumber(int) должен быть публичным и статическим.
•	Метод sumDigitsInNumber должен возвращать значение типа int.
•	Метод sumDigitsInNumber не должен ничего выводить на экран.
•	Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546123456));
    }

    //    public static int sumDigitsInNumber(int number) {
//        long start = System.currentTimeMillis();
//        System.out.println(start); // вывод 1594718268285
//
//        int sum = 0;
//        for (int i = number; i > 0; i = i / 10) {
//            sum = sum + i % 10;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end); // вывод 1594718268285
//        System.out.println(end - start); // время выполнения 0
//        return sum;
//    }
    public static int sumDigitsInNumber(int number) {
        long start = System.currentTimeMillis();
        System.out.println(start);//1594718431533
        int c;
        int result = 0;
        String n = Integer.toString(number);
        char[] chars = n.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            c = Character.getNumericValue(chars[i]);
            result = result + c;
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish); //1594718431534
        System.out.println(finish - start); //время выполнения - худший результат 1
        return result;
    }
}
//Что из этих алгоритмов быстрей я не знаю, банально не хватает длинны int,
//чтобы хоть как-то значительно нагрузить систему.
//В случае второго варианта в 10 попытках 1 была дольше на 1 мс.
//В первом случае 10 попыток дают 1 и тот же результат.
