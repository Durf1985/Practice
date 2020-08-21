package Core.level5.task1228;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Файл в статическом блоке
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит
 несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по
отдельности в List lines.

Требования:
•	Константа FILE_NAME не должна быть пустой.
•	В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по-отдельности
 в список lines.
•	Поле FILE_NAME НЕ должно быть final.
•	Класс Solution должен содержать список lines.
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader br = new BufferedReader(new FileReader(Statics.FILE_NAME));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                lines.add(sb.append(line).toString());
                sb = new StringBuilder();
                line = br.readLine();

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
