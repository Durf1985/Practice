package syntax.level03.task821;

/*
Не думать о секундах…
Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.

Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен быть целым положительным числом.
•	Выведенное число должно быть кратно 60.
•	Выводимое число должно соответствовать заданию.
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        date.setHours(15);
        date.setMinutes(30);
        Date date1 = new Date();
        date1.setHours(15);
        date1.setMinutes(00);

        int secondsAfter15 = (date.getMinutes() - date1.getMinutes()) * 60;
        System.out.println(secondsAfter15);
    }
}
// Ненавижу работу с датами!
