package syntax.level02.task511;

//Уровень 2 Лекция 5

/*
Самое нужное число
Закомментируй максимальное количество строк, чтобы на экран вывелось число 19

Требования:
•	Программа должна выводить на экран число 19.
•	Нельзя изменять строки с объявлением переменных.
•	Нельзя изменять строку отвечающую за вывод в консоль.
•	Нужно закомментировать некоторые строки и не менять остальные.
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + 3 * x;
//        x = x * 2;
        x = x * 16;
//        y = y + 2 * x;
        y = y + x;

        System.out.println(y);
    }
}
// подбешивает от таких задач
