package syntax.task02.task0206;

//Уровень 2 Лекция 2

/*
Наш первый конвертер!
Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32

Пример:
В метод convertCelsiusToFahrenheit на вход подается значение 41.

Пример вывода:
105.8

Требования:
•	Метод convertCelsiusToFahrenheit(int) должен быть публичным и статическим.
•	Метод convertCelsiusToFahrenheit должен возвращать значение типа double.
•	Метод convertCelsiusToFahrenheit не должен ничего выводить на экран.
•	Метод convertCelsiusToFahrenheit должен правильно переводить градусы Цельсия в градусы Фаренгейта и возвращать это число.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
//        double f = (double) (9 *celsius)/ 5 + 32;
        double a = (double) 9 / 5; // (double) преобразование int в double
        double f = a * celsius + 32;

        return f;
    }
}
// второй вариант, если не охота расставлять скобки и бодаться с порядком выполнения математических операций
// в компиляторе.
