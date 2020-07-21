package syntax.level08.task1127;

/*
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
 если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать два метода.
•	Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число,
 иначе false.
•	Метод main() должен вызывать метод isDateOdd().
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        int result = Integer.parseInt(new SimpleDateFormat("D").format(new Date(date)));
        if (result % 2 == 0) {
            return false;
        } else return true;
    }
    /*Честно, я обещал себе больше не ругаться... но... ЕБ ВАШУ МАТЬ, КАК Я НЕНАВИЖУ ЭТИ
     ЕБУЧИЕ ОПЕРАЦИИ С ДАТАМИ!!!! СУКА СКОЛЬКО РАЗ СТАЛКИВАЮСЬ СГОРАЕТ ЖОПА К ХЕРАМ!!! И ЭТИ ПАТТЕРНЫ ЕБАНЫЕ.
     СИДИТ СУКА СЕКРЕТУТКА ЕБАНАЯ "ОЙ МНЕ ТАК НЕ УДОБНО ДАТУ СМОТРЕТЬ В ТАКОМ ФОРМАТЕ КО-КО-КО", А ТЫ ПОТОМ
     ЕБЕЩЬСЯ КАК СУСЛИК

     Количество не используемых импортов показывает, что я пытался использовать, чтобы побороть.
     Хотел блять по умному распарсить строку, создать паттерн для получения года, из любой строки и т.д.
     ХУЙ БЛЯТЬ ТАМ НЕ ПЛАВАЛ, ТО ОДНО ГОВНО ОТВАЛИТЬСЯ, ТО ДРУГОЕ
     у меня всё РАУНД СУКА!
     */
}

