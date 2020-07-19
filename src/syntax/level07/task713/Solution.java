package syntax.level07.task713;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
 потом тот, который для x%2, потом последний.

Требования:
•	Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел).
Первый список будет главным, а остальные - дополнительными.
•	Считать 20 чисел с клавиатуры и добавить их в главный список.
•	Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
•	Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
•	Добавить в третий дополнительный список все остальные числа из главного.
•	Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
•	Программа должна вывести три дополнительных списка, используя метод printList.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
//            list.add(i);
            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                div3.add(list.get(i));
                div2.add(list.get(i));
            } else if (list.get(i) % 3 == 0) {
                div3.add(list.get(i));
            } else if (list.get(i) % 2 == 0) {
                div2.add(list.get(i));
            } else {
                other.add(list.get(i));
            }
        }
        printList(div3);
        printList(div2);
        printList(other);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int a :
                list) {
            System.out.print(a + " ");
        }
        System.out.println(); //тут написал более удобный вывод для себя, в оригина все подряд в столбик.
    }
}
