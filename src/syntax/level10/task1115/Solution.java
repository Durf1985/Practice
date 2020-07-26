package syntax.level10.task1115;

import java.util.ArrayList;

/*
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.

Требования:
•	Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
•	Метод createList должен возвращать созданный массив.
•	Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
•	Программа должна выводить данные на экран.
•	Метод main должен вызывать метод createList.
•	Метод main должен вызывать метод printList.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] lists = new ArrayList[5];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
            int size = (int) (Math.random() * 100);
            for (int j = 0; j < size; j++) {
                lists[i].add("" + j);
            }
        }
        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
