package syntax.level08.task67;

/*
LinkedList и ArrayList
Нужно создать два списка - LinkedList и ArrayList.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна содержать только три метода.
•	Метод createArrayList() должен создавать и возвращать список ArrayList.
•	Метод createLinkedList() должен создавать и возвращать список LinkedList.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static Object createArrayList() {
        ArrayList<Object> list = new ArrayList<>();
        return list;
    }

    public static Object createLinkedList() {
        LinkedList<Object> list = new LinkedList<>();

        return list;
    }

    public static void main(String[] args) {

    }
}
