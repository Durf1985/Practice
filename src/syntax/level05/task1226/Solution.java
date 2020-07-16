package syntax.level05.task1226;


/*
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address

Требования:
•	В классе Solution создай public static класс Man.
•	В классе Solution создай public static класс Woman.
•	Класс Man должен содержать переменные: name(String), age(int) и address(String).
•	Класс Woman должен содержать переменные: name(String), age(int) и address(String).
•	У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
•	Конструкторы должны инициализировать переменные
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("asdf", 1, "asdf");
        Woman woman = new Woman("asdf", 1, "asasdfdf");
        System.out.println(man);
        System.out.println(woman);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
