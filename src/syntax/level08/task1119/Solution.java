package syntax.level08.task1119;

/*
Set из котов
1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
•	Метод createCats() класса Solution должен возвращать множество (Set), содержащее 3 кота.
•	Метод printCats() класса Solution должен вывести на экран всех котов из множества.
 Каждый кот с новой строки.
•	Метод main() должен один раз вызывать метод createCats().
•	Метод main() должен вызывать метод printCats().
•	Метод main() должен удалять одного кота из множества котов.
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        Cat t = iterator.next();
        iterator.remove();// прошлый раз зачем то создавал цикл с запросом не вызывавшихся и прерывание

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat t :
                cats) {
            System.out.println(t);
        }
    }

    public static class Cat {

    }
}
