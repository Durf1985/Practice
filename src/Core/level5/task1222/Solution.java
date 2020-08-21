package Core.level5.task1222;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                break;
            } else {
                try {
                    if (s.contains(".")) {
                        Double a = Double.parseDouble(s);
                        print(a);
                    } else {
                        int a = Integer.parseInt(s);
                        if (a > 0 && a < 128) {
                            print((short) a);
                        } else {
                            print(a);
                        }
                    }
                } catch (NumberFormatException e) {
                    print(s);
                }
            }
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
