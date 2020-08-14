package Core.level4.task816;

/*
Исправление ошибок
*/

public class Solution {
    public static void main(String[] args) {
        Swimmable animal = new Orca(); // объекты создаются в переменной интерфейса.
        animal.swim(); // обращение к конкретной реализации
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimmable {
        public void swim() {
            // внутри абстрактного класса объявление переменной этого класса, в которой происходит
            // преобразование объекта созданного на основе переменной интерфейса, в которой хранится объект класса
            // наследника как интерфейса, так и абстрактного класса. Поэтому такое преобразование возможно.
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            // просиходит расширение типа от конкретного животного до животного океана.
            currentAnimal.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
            //getCurrentAnimal() получает ссылку на объект this у которого вызываются методы.
        }

        abstract Swimmable getCurrentAnimal(); // реализуется в наследнике
    }

    static class Orca extends OceanAnimal {
        @Override
        Swimmable getCurrentAnimal() {
            return this; // возвращает объект интерфейса?
        }
    }

    static class Whale extends OceanAnimal {

        @Override
        Swimmable getCurrentAnimal() {
            return this;
        }
    }

    static class Otter implements Swimmable, Walkable {

        @Override
        public void walk() {

        }

        @Override
        public void swim() {
        }
    }
}
