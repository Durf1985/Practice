package syntax.level08.task31;


import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
Set из растений
Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё следующие строки:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.

Требования:
•	Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
•	Программа не должна считывать строки с клавиатуры.
•	Программа должна добавлять в коллекцию 10 строк, согласно условию.
•	Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>(); // по алфавиту
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for (String s :
                set) {
            System.out.println(s);
        }

    }
}
