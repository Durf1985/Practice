package syntax.task02.task0203;

//Уровень 2 Лекция 2

/*
Считаем длину окружности
Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.

Требования:
•	В методе printCircleLength нужно вывести длину окружности, рассчитанную по формуле: 2 * Pi * radius.
•	Метод main должен вызывать метод printCircleLength с параметром 5.
•	Метод main не должен вызывать команду вывода текста на экран.
•	Программа должна выводить длину окружности с радиусом 5.
*/

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {

        System.out.println(2 * 3.14 * radius);
    }
}
