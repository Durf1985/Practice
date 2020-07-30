package Core.level2.task615;

/*
Кошки не должны быть абстрактными!
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы.
Классы Cat и Dog не должны быть абстрактными.

Требования:
•	Класс Pet должен быть абстрактным.
•	Класс Dog не должен быть абстрактным.
•	Класс Cat не должен быть абстрактным.
•	Класс Dog должен реализовать абстрактные методы из класса Pet.
•	Класс Cat должен реализовать абстрактные методы из класса Pet.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

    public static class Dog extends Pet{

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

}
