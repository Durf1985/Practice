package syntax.level06.task1117;

/*
Блокнот для новых идей
1. В классе Solution создать public static класс Idea.
2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить
 на экран описание идеи - это то, что возвращает метод getDescription().

Требования:
•	В классе Solution создать public static класс Idea.
•	В классе Idea создать метод public String getDescription().
•	Метод getDescription должен возвращать любую строку.
•	В классе Solution создайте метод public static void printIdea(Idea idea).
•	Метод printIdea должен выводить описание идеи на экран.
*/

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
//        Test test = new Test();
//        test.asdf();
        printIdea(new Idea());
        // если изменить класс идею на не статик, то компилятор выдаст ошибку,
        // т.е. !!вложенный!! не статический класс не может быть создан из метода main или через создание экземпляра
        // внешнего класса. Но можно сделать так, как сделано в закоментированных строках и внешнем классе Test.java
        // как это использовать пока не понятно, но очень интересно)))
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescriptor()); // в статик класс можно передавать
    }

    public static class Idea {
        public String getDescriptor() {

            return "любая строка";
        }


    }
}
//public  class Idea {
//        public String getDescriptor() {
//
//            return "любая строка";
//        }
//
//
//    }

//напишите тут ваш код

