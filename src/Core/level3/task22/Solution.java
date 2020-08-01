package Core.level3.task22;

/*
Пиво-2. Возвращение
Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.

Требования:
•	Класс AlcoholicBeer должен реализовывать(implements) интерфейс Drink.
•	В классе AlcoholicBeer должны быть реализованы все методы интерфейса Drink.
•	В классе AlcoholicBeer должно содержаться только два метода.
•	Метод isAlcoholic должен возвращать true, т.к. пиво содержит алкоголь.
•	Программа должна выводить на экран тип напитка в зависимости от того что возвращает метод isAlcoholic.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic(); // метод интерфейса содержит сигнатуру метода, которую нельзя
        // перегрузить, в классе, который имплементирует интерфейс
        default void test() { // так же нельзя перегрузить дефолтовые методы в классе реализаторе

        }

        default void test(String s) {// но можно перегрузить дефолтные методы в самом интерфейсе

        }

//        boolean isAlcoholic(boolean a); // так же можно перегрузить и абстрактные методы.

    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

        @Override
        public boolean isAlcoholic() { // переопределить метод невозможно
            return true;
        }

    }
}
