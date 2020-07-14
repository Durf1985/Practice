package syntax.level03.task34;

/*
Задача на проценты
Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.

Пример:
return 123 * 435;

Требования:
•	Метод addTenPercent должен увеличивать переданное число на 10% процентов.
•	Метод main должен вызывать метод addTenPercent.
•	Метод main должен выводить результаты вызова на экран.
•	Метод addTenPercent не должен ничего выводить на экран.
*/

public class Solution {
    public static double addTenPercent(int i) {


        return i + (i * 0.1); // первый раз решал i*1.1 не похоже на мое решение, скорее всего подсматривал
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
