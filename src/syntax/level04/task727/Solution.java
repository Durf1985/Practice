package syntax.level04.task727;

/*
Описываем числа
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число

Требования:
•	Программа должна считывать одно число c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Программа должна выводить только строку-описание числа и больше ничего.
•	Если число четное и имеет одну цифру, вывести "четное однозначное число".
•	Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
•	Если число четное и имеет две цифры, вывести "четное двузначное число".
•	Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
•	Если число четное и имеет три цифры, вывести "четное трехзначное число".
•	Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
•	Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine(); // у вас уже есть строка, длинна которой будет количеством разрядов числа
        int a = Integer.parseInt(input);  // так же у вас есть число, которое надо проверить на четность
        if (a > 0 && a < 1000) {
            if (even(a)) {
                System.out.println("четное " + lenght(input));
            } else System.out.println("нечетное " + lenght(input));
        } else {
        }
    }


    public static boolean even(int a) {
        return a % 2 == 0;
    }

    public static String lenght(String in) {
        if (in.length() == 1) {
            return "однозначное число";
        } else if (in.length() == 2) return "двузначное число";
        else return "трехзначное число";
    }
}