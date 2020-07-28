package Core.level1.task1123;

import java.util.Arrays;

/*Минимакс
Написать метод, который возвращает минимальное и максимальное числа в массиве.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Класс Pair не изменять.
•	Метод main не изменять.
•	Допиши реализацию метода getMinimumAndMaximum, он должен возвращать пару из минимума и максимума.
•	Программа должна вывести правильный результат.
•	Метод getMinimumAndMaximum не должен изменять массив inputArray.
*/
public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        Arrays.sort(inputArray);

        return new Pair<Integer, Integer>(inputArray[0], inputArray[inputArray.length - 1]);
    }

    public static class Pair<X, Y> { // у класса можно задавать... вообще че это такое???? в упор не помню
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
