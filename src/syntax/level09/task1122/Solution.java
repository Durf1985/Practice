package syntax.level09.task1122;

/*
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.

Требования:
•	Программа должна считывать данные с клавиатуры.
•	В программе должна быть объявлена переменная типа SimpleDateFormat.
•	В программе должна быть объявлена переменная типа Date.
•	Программа должна выводить данные на экран.
•	Вывод должен соответствовать заданию.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        SimpleDateFormat indate= new SimpleDateFormat("yyyy-MM-dd");
        Date in= indate.parse(input);// строка ПАРСИРУЕТСЯ
        SimpleDateFormat outdate = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        System.out.println(outdate.format(in).toUpperCase()); // дата ФОРМАТИРУЕТСЯ
        // ох сук, кто выдумал разные форматы дат, должен в аду гореть вечно.
        // 4 раз прохожу эту задачу, с периодом от пол года до года и каждый раз жопа полыхает от злости
        // просто интуитивно не понятная залупаю дабл ю тридцать восемь.
        // я реально надеюсь, что в реальных проектах работа с этой поеботой меньше одного процента
        // времени... иначе нахер мне не нужна такая работа...
    }
}
