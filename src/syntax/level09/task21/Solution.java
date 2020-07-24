package syntax.level09.task21;

/*
Возвращаем StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.

Требования:
•	В классе должно быть 5 методов (метод main не учитывать).
•	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
•	Каждый метод должен возвращать свой StackTrace.
•	Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
//        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
//        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
//        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();

        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        return Thread.currentThread().getStackTrace();
    }
}
