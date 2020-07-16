package syntax.level05.task54;

/*
Трикотаж
Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое.
 Наполните этих троих жизнью, то есть, конкретными данными.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Нужно создать три объекта типа Cat.
•	Класс Cat нельзя изменять.
•	Программа не должна выводить данные на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("вапр",1,3,5);
        Cat cat2 = new Cat("вап",2,4,6);
        Cat cat3 = new Cat("фыва",3,4,5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
