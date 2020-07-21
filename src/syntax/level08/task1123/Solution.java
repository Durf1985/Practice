package syntax.level08.task1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать строку с клавиатуры.
•	Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] string = reader.readLine().split(" ");
        for (String s :
                string) {
            StringBuilder sb = new StringBuilder();
            char[] chars = s.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            for (int i = 0; i < chars.length; i++) {
                sb.append(chars[i]);
            }
            System.out.print(sb.toString() + " ");
        }
// можно еще вот так...
/* for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")) {
но мне не понятно,  зачем тут этот if??? может какая-то логика есть о которой я забыл, но на первый
взгляд он тут нафиг не нужен...
            } else {
                String out = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
                System.out.print(out + " ");

            }*/
    }
}
