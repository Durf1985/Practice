package syntax.level10.task1119;

/*
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            String values = reader.readLine();
            if (values.isEmpty()) {
                break;
            }
            int i = Integer.parseInt(values);
            String keys = reader.readLine();
            if (keys.isEmpty()) {
                break;
            }
            map.put(keys, i);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
