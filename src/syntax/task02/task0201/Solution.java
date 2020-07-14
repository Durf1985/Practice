package syntax.task02.task0201;

//Уровень 2 лекция 1

/*
Реализуем метод print
Допиши код в методе print, чтобы он выводил на экран каждую переданную в него строку 4 раза. Каждый раз с новой строки.

Например, при таком вызове:
print("Java opens many opportunities!");

На экран должно быть выведено:
Java opens many opportunities!
Java opens many opportunities!
Java opens many opportunities!
Java opens many opportunities!

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать System.out.println или System.out.print.
•	Метод print должен выводить текст на экран.
•	Метод main должен вызвать метод print класса Solution ровно три раза.
•	Метод print должен выводить на экран переданную строку 4 раза. Каждый раз с новой строки.
*/
public class Solution {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String s) {
        for (int i = 0; i < 4; i++) {
            System.out.println(s);
        }
    }
}
