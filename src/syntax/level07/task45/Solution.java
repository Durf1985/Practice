package syntax.level07.task45;

/*
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать большой массив на 20 целых чисел.
•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
•	Программа должна создавать два маленьких массива на 10 чисел каждый.
•	Программа должна скопировать одну половину большого массива в первый маленький,
    а вторую - во второй и вывести второй маленький массив на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        int[] a;
        int[] b;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        a = Arrays.copyOfRange(ints, 0, 9);
        // блин вот я тупенький вместо индекса массива в конструктор я вносил значение определенной
        // ячейки ints[i], а потом сижу и на жопе нервно от злости ерзаю...
        b = Arrays.copyOfRange(ints, 10, ints.length);

        for (int c :
                b) {
            System.out.println(c);
        }
    }
    // вообще не помню чтобы я это писал, хотя способ наименования переменных точно мой.
    //        копирования массива с неизвестной длинной на 2 половины
//        ---------------------------------------

//        int check = (array.length - 1) / 2;
//        int bArray = 0;// это счетчик ячеек для второго массива.
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//            if (i <= check) {
//                minia[i] = array[i];
//            } else {
//                minib[bArray] = array[i];
//                bArray++;
//            }
//    }
//        for (int i = 0; i < minib.length; i++) {
//            System.out.println(minib[i]);
//        -------------------------------------------
}
