package Core.level2.task1225;

/*
Посетители
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
"Кот", "Тигр", "Лев", "Бык", "Корова", "Животное".

Замечание:
постарайся определять тип животного как можно более точно.

Требования:
•	Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Cow, Animal.
•	Класс Solution должен содержать метод String getObjectType(Object o).
•	Метод getObjectType() должен возвращать строку "Кот", если передан объект типа Cat.
•	Метод getObjectType() должен возвращать строку "Тигр", если передан объект типа Tiger.
•	Метод getObjectType() должен возвращать строку "Лев", если передан объект типа Lion.
•	Метод getObjectType() должен возвращать строку "Бык", если передан объект типа Bull.
•	Метод getObjectType() должен возвращать строку "Корова", если передан объект типа Cow.
•	Метод getObjectType() должен возвращать строку "Животное", если передан объект типа Animal.
•	Программа должна выводить на экран результат метода getObjectType().
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {

        return o.toString();
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
        @Override
        public String toString() {
            return "Кот";
        }
    }

    public static class Tiger extends Cat {
        @Override
        public String toString() {
            return "Тигр";
        }
    }

    public static class Lion extends Cat {
        @Override
        public String toString() {
            return "Лев";
        }
    }

    public static class Bull extends Animal {
        @Override
        public String toString() {
            return "Бык";
        }
    }

    public static class Cow extends Animal {
        @Override
        public String toString() {
            return "Корова";
        }
    }

    public static class Animal {
        @Override
        public String toString() {
            return "Животное";
        }
    }
}