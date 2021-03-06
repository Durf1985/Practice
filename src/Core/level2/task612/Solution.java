package Core.level2.task612;

/*
«Исправь код», часть 1
Исправь код, чтобы программа компилировалась.

Подсказка:
метод getChild должен остаться абстрактным.

Требования:
•	Класс Pet должен быть статическим.
•	Класс Pet должен иметь два метода.
•	Метод getChild() должен быть абстрактным.
•	Класс Pet должен быть объявлен с модификатором, который запрещает создавать конкретные объекты этого класса.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract static class Pet {// честно не понял задания, потому что изначально класс уже объявлен абстрактными..
        public String getName() {// Абстрактный класс может содержать методы с реализацией
            return "Я - котенок";
        }

        public abstract Pet getChild();// либо изначально тут отсутствовал модификатор abstract
    }
}
