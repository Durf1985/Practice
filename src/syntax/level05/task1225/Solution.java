package syntax.level05.task1225;

/*
И целой утки мало
По аналогии с классом Duck (утка) создай классы Cat (кошка) и Dog (собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.

Требования:
•	Создай класс Cat(кошка).
•	Создай класс Dog(собака).
•	У класса Cat должен быть верно реализован метод toString.
•	У класса Dog должен быть верно реализован метод toString.
•	В методе main создай два объекта типа Cat.
•	В методе main создай два объекта типа Dog.
•	Выведи все созданные объекты на экран.
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(cat1);


        //напишите тут ваш код
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //напишите тут ваш код
}
