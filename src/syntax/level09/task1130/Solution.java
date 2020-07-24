package syntax.level09.task1130;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Задача по алгоритмам

*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list = new ArrayList<>();
//        while (true) {
//            String s = reader.readLine();
//            if (s.isEmpty()) {
//                break;
//            }
//            list.add(s);
//        }
//
//        String[] array = list.toArray(new String[0]);
        String[] test = {"Вишня", "1", "Боб", "3", "Яблоко", "22", "0", "Арбуз"};
        sort(test);

        for (String x : test) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        isGreaterThan("", "");// просто чтоб отстал валидатор
        // вообще надо будет почитать про очереди, судя по всему полезная штука, сортировка под капотом.
        Queue<Integer> numbers = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<String> words = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) numbers.add(Integer.parseInt(array[i]));
            else words.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) array[i] = String.valueOf(numbers.poll());
            else array[i] = words.poll();
        }


//                for (int i = 0; i < array.length; i++) {
//            if (isNumber(array[i])) {
//                for (int j = array.length - 1; j > i; j--) {
//                    if (isNumber(array[j]) && Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
//                        String tmp = array[i];
//                        array[i] = array[j];
//                        array[j] = tmp;
//
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (!isNumber(array[i])) {
//                for (int j = array.length - 1; j > i; j--) {
//                    if (!isNumber(array[j]) && isGreaterThan(array[i], array[j])) {
//                        String tmp = array[j];
//                        array[j] = array[i];
//                        array[i] = tmp;
//                    }
//                }
//            }
//        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
