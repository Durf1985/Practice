package Core.level5.task1230;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Formatter;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String input = reader.readLine();
//        reader.close();
        String s = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo&obj=3.14&obj&name=Amigo&obj=Amom";
        URL url = new URL(s); // просто для простоты тестирования используется заранеее созданная строка.
        String param = url.getQuery(); //все что после html? т.е. список параметров. Чтобы руками не парсить.
        System.out.println(param);

        String[] pametr = param.split("[&]"); //разделение строки на массив с параметрами
        for (String a : pametr) {
            if (a.contains("=")) {// если параметр имеет значение
                String[] b = a.split("=");// разделить эту строку и напечатать первый индекс массива
                System.out.print(b[0] + " ");
            } else {
                System.out.print(a + " ");// если параметр без значения, просто вывести на печать
            }
        }
        System.out.println();


        String[] value = param.split("[&]"); // думаю можно объединить это в 1 цикл, при желании
        for (String x : value) {
            if (x.contains("obj=")) { // проверка на условие
                String[] a = x.split("=");
                try {
                    double d = Double.parseDouble(a[1]); // пробуем парсить, если не получилось, то строка
                    alert(d);
                    // если получилось, то будет присвоено значение double и автоматически вызовется
                    // нужная реализация
                } catch (NumberFormatException e) {
                    alert(a[1]); // отправка значения из массива строк, будет вызвана реализация строки.
                }
            }

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

