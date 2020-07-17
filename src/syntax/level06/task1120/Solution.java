package syntax.level06.task1120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Исправляем ошибки юности
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить результат на экран.
•	Текст выведенный на экран должен начинаться с «The max is».
•	Текст выведенный на экран должен заканчиваться максимумом из 2х введенных чисел.
*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String maximum = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = Math.max(a, b);
        // вообще у метода есть недостаток, если ты не знаешь, какие числа приходят ему на вход,
        // то ты не узнаешь максимум это или они просто равны. на подобие с проверкой делителя на условие
        // он не равен нулю, т.е. в делитель может попасть число равное нулю просто из другого метода
        // и желательно при динамической инициализации указывать условие если b = 0*1; a = a/b, то только если b!=0,
        // так и в случае с Math.max/min может получиться так что формула дала 2 одинаковых числа и вы этого не узнаете

        System.out.println(maximum + max);
    }
}
