package syntax.level02.task816;

// Уровень 2 Лекция 8

/*
Печатаем трижды
Реализуй метод print3. Метод должен вывести переданную строку (слово) на экран три раза через пробел.

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать функцию System.out.println или System.out.print.
•	Метод print3 должен выводить текст на экран.
•	Метод main должен вызвать метод print3 ровно два раза.
•	Метод print3 должен выводить переданную строку (слово) на экран три раза, но в одной строке.
*/
public class Solution {
    public static void print3(String s) {
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println(s);
            } else {
                System.out.print(s + " ");
            }
        }

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
