package syntax.level08.task814;

/*
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
•	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> list = new HashSet<>();
        int count = 0;
        for (int i = 0; i < 31; i++) {
            list.add(i);
            count++;
        }
        System.out.println(count);
        return list;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a > 10) {
                iterator.remove(); // из списка удаляется текущий итератор, а не set.remove
            }
        }
// так это не будет работать, потому что итератор бросит исключение, если вызван не явным образом. Во всех случаях.
//        for (int a :
//                set) {
//            if (a > 10) {
//                set.remove(a);
//            }
//        }
        System.out.println(set);
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> list = createSet();
        removeAllNumbersGreaterThan10(list);
    }
}
