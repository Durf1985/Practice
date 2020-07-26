package syntax.level10.task1113;

/*
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	В классе Human должно быть 6 полей.
•	Все поля класса Human должны быть private.
•	В классе Human должно быть 10 конструкторов.
•	Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private Human human;
        private int anInt;
        private char aChar;
        private String s;
        private boolean b;
        private String a;

        public Human(Human human) {
            this.human = human;
        }

        public Human(Human human, boolean b) {
            this.human = human;
            this.b = b;
        }

        public Human(Human human, int anInt) {
            this.human = human;
            this.anInt = anInt;
        }

        public Human(Human human, String s) {
            this.human = human;
            this.s = s;
        }

        public Human(Human human, char aChar) {
            this.human = human;
            this.aChar = aChar;
        }

        public Human(Human human, int anInt, char aChar) {
            this.human = human;
            this.anInt = anInt;
            this.aChar = aChar;
        }

        public Human(Human human, int anInt, char aChar, String s) {
            this.human = human;
            this.anInt = anInt;
            this.aChar = aChar;
            this.s = s;
        }

        public Human(Human human, int anInt, char aChar, String s, boolean b) {
            this.human = human;
            this.anInt = anInt;
            this.aChar = aChar;
            this.s = s;
            this.b = b;
        }

        public Human(Human human, int anInt, char aChar, String s, boolean b, String a) {
            this.human = human;
            this.anInt = anInt;
            this.aChar = aChar;
            this.s = s;
            this.b = b;
            this.a = a;
        }
    }
}
