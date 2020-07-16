package syntax.level05.task1228;

/*
Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".

Требования:
•	Дата должна содержать день, месяц и год, разделенные пробелом.
•	День должен соответствовать текущему.
•	Месяц должен соответствовать текущему.
•	Год должен соответствовать текущему.
•	Вся дата должна быть выведена в одной строке.
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        System.out.println(sdf.format(date.getTime()));
    }
}
