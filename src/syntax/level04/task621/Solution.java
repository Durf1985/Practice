package syntax.level04.task621;

/*
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.

Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если имена одинаковые вывести сообщение "Имена идентичны"
•	Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
•	Если имена и длины имен разные - ничего не выводить.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();
        if (name.equals(name1)) {
            System.out.println("Имена идентичны");
        } else if (name.length() == name1.length()) {
            System.out.println("Длины имен равны");
        }

    }
}
