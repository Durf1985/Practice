package syntax.level04.task1337;

/*
Треугольник из восьмерок
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888

Требования:
•	Программа не должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
•	В программе должен использоваться цикл for.
*/

public class Solution {
    public static void main(String[] args) {
        String s = "8";
        for (int i = 0; i < 10; i++) {
            System.out.println(s);
            s += "8";
        }


//        хотя можно и так... вообще не знаю, почему я прошлый раз решал эту задачу таким образом
//        int j = 1;
//        for (int i = 0; i < 10; i++) {
//            for (int k = 0; k < j; k++) {
//                System.out.print(8);
//            }
//            System.out.println();
//            j++;
//        }


    }
}
