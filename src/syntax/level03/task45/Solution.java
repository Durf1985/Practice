package syntax.level03.task45;

/*
Я так давно родился
Вывести на экран дату своего рождения в виде:
MAY 1 2012

Требования:
•	Выводимый текст должен содержать месяц, день и год, разделенные пробелом.
•	Название месяца должно выводиться на английском языке и заглавными буквами.
•	Год должен состоять из четырех цифр и быть не меньше 1900.
•	Дата рождения должна предшествовать текущей.
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        String month = "MAY";
        int day = 1;
        int year = 2012;
        System.out.println(month + " " + day + " " + year);
    }
}
