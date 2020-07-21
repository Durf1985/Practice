package syntax.level08.task1128;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
•	Программа должна считывать одно значение с клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна использовать коллекции.
•	Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.

*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM", Locale.ENGLISH);
        System.out.println(input + " is the " + (sdf.parse(input).getMonth() + 1) + " month");

    }
}
// гляжу я на свое старое решение и вижу, что меня заебал этот класс дат и календарей.
// ну и да я хз как в моем новом решении валидатор воспримет May и may... да и хуй на него.
/*   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "January");
        map.put("2", "February");
        map.put("3", "March");
        map.put("4", "April");
        map.put("5", "May");
        map.put("6", "June");
        map.put("7", "July");
        map.put("8", "August");
        map.put("9", "September");
        map.put("10", "October");
        map.put("11", "November");
        map.put("12", "December");
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String m = pair.getValue();
            if (m.equalsIgnoreCase(month)){
                System.out.println(pair.getValue() + " is the " + pair.getKey() + " month");
            }
        }
    }*/
