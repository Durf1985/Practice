package Core.level2.task1233;

/*
Изоморфы наступают
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).

Требования:
•	Класс Solution должен содержать класс Pair.
•	Класс Solution должен содержать два метода.
•	Класс Solution должен содержать метод getMinimumAndIndex().
•	Метод getMinimumAndIndex() должен возвращать минимальное число в массиве и его позицию (индекс).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }

        return new Pair<Integer, Integer>(min, index);
    }


    public static class Pair<X, Y> { // второй раз встречаю такую запись, надо срочно узнать, что это за дженерик такой???
        public X x;
        public Y y; //  Y описывается как класс в документации и наследуется от Object... но я не могу найти
        // где его объявляют этот класс.

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
