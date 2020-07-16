package syntax.level05.task55;

/*
Кошачья бойняСоздать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Нужно создать три объекта типа Cat.
•	Нужно провести три боя.
•	Программа должна вывести результат каждого боя с новой строки.

*/

public class Solution {

    public static void main(String[] args) {
        // напишите ваш код тут
        Cat a = new Cat("asdf", 2, 3, 5);
        Cat b = new Cat("dfgh", 5, 4, 6);
        Cat c = new Cat("lkj", 2, 1, 4);
        System.out.println(a.fight(b));
        System.out.println(b.fight(c));
        System.out.println(a.fight(c));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
