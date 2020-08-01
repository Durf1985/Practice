package Core.level3.task1126;

/*
Сортировка четных чисел из файла

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>(); // создал список
        while (fis.available() > 0) { // количество
            StringBuilder a = new StringBuilder(); // формирование строки
            while (fis.available() > 0) { // условие внутреннего цикла такое, чтобы не прописывать отдельное решение,
                // если это последний символ в последней строке.
                char c = (char) fis.read();// преобразование считанного байта в символ
                if (c == '\n' || c == '\r') break;// если перевод строки или возврат каретки прервать выполнение
                a.append(c);// иначе присоединить символ
            }
            String s = a.toString(); // формирование строки из буффера
            if (!s.equals("")) {// если строка не пустая
                list.add(Integer.parseInt(s));// преобразовать строку в число и запихнуть в массив.
            }
        }
        Collections.sort(list);
        for (Integer i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        fis.close();
        reader.close();
    }
}
