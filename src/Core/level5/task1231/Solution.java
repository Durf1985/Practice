package Core.level5.task1231;

/*
ООП. Hrivna — тоже деньги
Исправь класс Hrivna так, чтоб избежать возникновения ошибки StackOverflowError.

Требования:
•	Класс Hrivna должен быть потомком класса Money.
•	В классе Hrivna должен быть реализован метод getAmount.
•	Метод getAmount в классе Hrivna должен возвращать значение поля amount.
•	В процессе выполнения программы НЕ должны возникать исключения или ошибки.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount(); // если не переопределить, то метод вызывает сам себя до бесконечности
        }
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        public double amount = 123d;

        public Hrivna getMoney() {
            return this;
        }
        public Double getAmount(){
            return amount;
        }

    }
}
