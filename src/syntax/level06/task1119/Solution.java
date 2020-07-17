package syntax.level06.task1119;

/*
Три статические переменные name
Добавь 3 public статических переменных: String Solution.name, String Cat.name, String Dog.name.

Требования:
•	В класс Solution добавь public статическую переменную name типа String.
•	В класс Cat добавь public статическую переменную name типа String.
•	В класс Dog добавь public статическую переменную name типа String.
•	В каждом классе должна быть своя переменная name.
*/

public class Solution {
    public static String name = "solution";

    public static class Cat {
        public static String name = "cat";
    }

    public static class Dog {
        public static String name = "dog";
    }

    public static void main(String[] args) {
        System.out.println(Solution.name);
        System.out.println(Cat.name);
        System.out.println(Dog.name);
    }
}
