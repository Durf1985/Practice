package syntax.level05.task57;

/*
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a == -1) {
                if (count != 0) {
                    System.out.println((double) sum / count);
                }
                break;
            }
            sum += a;
            count++;
        }


    }
}

