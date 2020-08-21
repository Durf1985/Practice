package Core.level5.task1219;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Осваивание статического блока
*/

public class Solution {
    public static CanFly result;

    static {
        reset();
    }

    public static void main(String[] args) {

    }

    public static void reset() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine();
            if (input.equals("helicopter")) {
                result = new Helicopter();
            } else if (input.equals("plane")) {
                int count = Integer.parseInt(reader.readLine());
                result = new Plane(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
