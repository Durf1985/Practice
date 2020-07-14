package syntax.level03.task512;

/*
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hours) {

        return hours * 3600;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));

    }
}
