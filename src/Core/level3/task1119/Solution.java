package Core.level3.task1119;


import java.io.*;

/*
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.

Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего читать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));
//        BufferedWriter bufferedWriter = new BufferedWriter
//                (new FileWriter("D:\\Practice\\src\\Core\\level3\\task1119\\TestWrite.txt"));
        while (true) {
            String input = reader.readLine();
            if (input.equals("exit")) {
                bufferedWriter.write(input);
                break;
            }
            bufferedWriter.write(input);
            bufferedWriter.newLine();
            bufferedWriter.flush(); // Метод выводит данные из буфера и помещает их в предназначенное для них место,
            // записывает в файл, хотя и без этого метода в данном случае запись происходит, возможно это связано с тем,
            // что использовать поток могут несколько ресурсов и чтобы не потерялись данные flush
        }
        bufferedWriter.close();
        reader.close();
    }
}
