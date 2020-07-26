package syntax.level10.task47;

/*
Задача №7 на преобразование целых типов
Убери ненужные операторы приведения типа, чтобы получился ответ: 1234567
long l = (byte)1234_564_890L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x - (float)m;
l = (long) f / 1000;

Требования:
•	Программа должна выводить текст на экран.
•	Нельзя менять команду вывода на экран.
•	Метод main() должен содержать переменную l типа long.
•	Метод main() должен содержать переменную x типа int.
•	Метод main() должен содержать переменную m типа double.
•	Метод main() должен содержать переменную f типа float.
•	Значения переменных менять нельзя. Можно добавлять только операторы приведения типа.
•	Программа должна выводить текст 1234567.
*/

public class Solution {
    public static void main(String[] args) {
        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        /* I wrote this code and I can't understand where I got the last number in the answer not 7, but 8
        рука-лицо
        System.out.println("long l = " + l);
        System.out.println("int x = " + x);
        System.out.println("double m =" + m);
        System.out.println("(byte) l++ =" + l++);// so this increment caused the error in the response to grow)))
        System.out.println("++x = " + ++x);
        System.out.println("(float) m = " + (float) m);*/

        System.out.println(l);
    }
}
