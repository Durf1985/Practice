package syntax.level03.task613;

/*
Мама мыла раму
Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".

Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.

Пример:
МылаРамуМама
РамуМамаМыла
...

Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации.
*/

public class Solution {
    public static void main(String[] args) {
        String a = "Мама";  //напишите тут ваш код
        String b = "Мыла";  //напишите тут ваш код
        String c = "Раму";
        System.out.println(a+b+c);
        System.out.println(c+b+a);
        System.out.println(a+c+b);
        System.out.println(b+c+a);
        System.out.println(c+a+b);
        System.out.println(b+a+c);
    }
}
