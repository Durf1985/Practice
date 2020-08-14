package Core.level4.task47;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Player and Dancer
1. Подумать, что делает программа.
2. Изменить метод haveFun так, чтобы он вызывал метод
- play, если person имеет тип Player.
- dance, если person имеет тип Dancer.

Требования:
•	Класс Player должен реализовывать интерфейс Person.
•	Класс Dancer должен реализовывать интерфейс Person.
•	Метод haveFun должен вызывать метод play, если переданный ему объект является игроком(Player).
•	Метод haveFun должен вызывать метод dance, если переданный ему объект является танцором(Dancer).
•	Метод main должен считывать данные с клавиатуры.
•	Метод main должен прекращать считывать данные с клавиатуры, если введенная строка равна "exit".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null; // это переменная интерфейса класс Player и класс Dancer реализуют его
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                // мы создаем объект определенного типа, который зависит от запроса
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        if (person instanceof Dancer) { // в зависимости от того, какой объект хранится в переменной интерфейса
            ((Dancer) person).dance();// мы преобразовываем его в нужный нам тип, для вызова методов именно этого типа
//            Dancer dancer = (Dancer) person; // аналог записи выше.
//            dancer.dance();
        } else if (person instanceof Player) {
            ((Player) person).play();
        }
    }

    interface Person { // интерфейс не имеет ни одного метода и по сути является маркерным.
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
