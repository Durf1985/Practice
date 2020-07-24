package syntax.level09.task1129;

/*
Обогатим код функциональностью!
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то программа должна вывести надпись
"Файл не существует." и еще один раз прочитать имя файла с консоли, а уже потом считывать файл для записи.

Требования:
•	Программа должна считывать имена файлов.
•	Метод main должен обрабатывать исключения кидаемые методом getInputStream. Если возникло исключение,
 нужно вывести сообщение «Файл не существует.».
•	Программа должна копировать содержимое первого файла во второй.
•	В методе main должен вызываться метод getInputStream.
•	Метод getInputStream изменять нельзя.
•	В методе main должен вызываться метод getOutputStream.
•	Метод getOutputStream изменять нельзя.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream fileInputStream;
        try {
            fileInputStream = getInputStream(reader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
            fileInputStream = getInputStream(reader.readLine());
        }

        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
