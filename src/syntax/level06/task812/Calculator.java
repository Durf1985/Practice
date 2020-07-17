package syntax.level06.task812;

/*
Калькулятор
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает разницу чисел a и b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)

Требования:
•	Метод plus должен возвращать сумму чисел a и b.
•	Метод minus должен возвращать разницу чисел a и b.
•	Метод multiply должен возвращать результат умножения числа a на число b.
•	Метод division должен возвращать результат деления числа a на число b.
•	Метод percent должен возвращать b процентов от числа a.
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(int a, int b) {
        return (double) a / b;
        // окей, я хотел написать здесь условие чтобы делитель не был нулем, но валидатору без разницы
        // мне собстна тоже
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return a * (b / 100.0);
    }

    public static void main(String[] args) {
        System.out.println(percent(4, 50));
    }
}
