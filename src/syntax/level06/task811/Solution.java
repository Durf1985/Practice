package syntax.level06.task811;

/*
Контролируем массу тела

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());
        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double index = weight / (height * height);
            if (index < 18.5) System.out.println("Недовес: меньше чем 18.5");
            else if (18.5 >= index || index < 24.9) System.out.println("Нормальный: между 18.5 и 24.9");
            else if (24.9 >= index || index < 29.9) System.out.println("Избыточный вес: между 25 и 29.9");
            else if (30 <= index) System.out.println("Ожирение: 30 или больше");
        }
    }
}
