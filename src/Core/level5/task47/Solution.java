package Core.level5.task47;

/*
ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.

Требования:
•	В классе Solution должны быть реализованы 10 методов printMatrix с различными аргументами.
•	Класс Solution должен быть public.
•	Все методы класса Solution должны быть статическими.
•	Все методы класса Solution должны быть публичными.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }

    }

    public static void printMatrix(int a) {

    }

    public static void printMatrix(Object val) {
    }

    public static void printMatrix(String s, int a) {
    }

    public static void printMatrix(int a, String s) {
    }

    public static void printMatrix(String s, Object val) {
    }

    public static void printMatrix(Object val, int a) {
    }

    public static void printMatrix(Object val, String s, int a) {
    }

    public static void printMatrix(String s, Object val, String a) {
    }
}
