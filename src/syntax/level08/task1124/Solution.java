package syntax.level08.task1124;

/*
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать,
трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
•	Программа должна выводить текст на экран.
•	Класс Human должен содержать четыре поля.
•	Класс Human должен содержать один метод.
•	Класс Solution должен содержать один метод.
•	Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки,
 две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human gF1 = new Human("asdf", true, 100);
        Human gF2 = new Human("sdfg", true, 100);
        Human gM1 = new Human("zxcv", false, 99);
        Human gM2 = new Human("xcvb", false, 99);

        Human father = new Human("qwer", true, 50);
        Human mother = new Human("wert", false, 50);

        Human child = new Human("gfhj", true, 10);
        Human child1 = new Human("gfhj1", true, 11);
        Human child2 = new Human("gfhj2", true, 12);
        father.children.add(child);
        father.children.add(child1);
        father.children.add(child2);
        mother.children.add(child);
        mother.children.add(child1);
        mother.children.add(child2);
        gF1.children.add(father);
        gM1.children.add(father);
        gF2.children.add(mother);
        gM2.children.add(mother);
        System.out.println(gF1.toString());
        System.out.println(gF2.toString());
        System.out.println(gM1.toString());
        System.out.println(gM2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        // а вот правильное решение. Я помнил, что как то так можно решить, но забыл как
        // передавать в конструктор переменное число объектов и вместо них пытался передать переменное
        // число массивов. ArrayList<Human> ... children. Смотри на тип данных.!!!
        /* public Human(String name, boolean sex, int age, Human... humans) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, humans);
            Мы передаем n-ое число объектов, а потом все их добавляем в массив. Более
            того этих объектов может и не быть вовсе, следовательно можно обойтись 1 конструктором,
            вместо моего решения в 2 конструктора.
            */

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
