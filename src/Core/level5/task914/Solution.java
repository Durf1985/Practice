package Core.level5.task914;


import java.util.HashMap;
import java.util.Map;

/*
Статики-1
В статическом блоке инициализировать labels 5 различными парами ключ-значение.

Требования:
•	В классе Solution должен быть только один метод (main).
•	В классе Solution должно быть объявлено статическое поле labels типа Map.
•	Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
•	Метод main должен выводить содержимое labels на экран.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "23");
        labels.put(2.0, "12");
        labels.put(3.9, "sdf");
        labels.put(32.4, "zv");
        labels.put(345.6, "fhg");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
