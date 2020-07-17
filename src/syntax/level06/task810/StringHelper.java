package syntax.level06.task810;

/*
Класс StringHelper
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Методы класса StringHelper должны возвращать строку.
•	Методы класса StringHelper должны быть статическими.
•	Методы класса StringHelper должны быть public.
•	Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
•	Метод multiply(String s) должен возвращать строку повторенную 5 раз.
*/

public class StringHelper {
    public static String multiply(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(s);
        }
        String result = sb.toString();
        //напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        String result = sb.toString();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("asdf", 10));
    }
}
