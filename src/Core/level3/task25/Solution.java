package Core.level3.task25;

/*
Четыре ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.

Требования:
•	Переменные объявленные в интерфейсе могут иметь только самый широкий уровень доступа(public).
•	Унаследоваться(extends) можно только от класса, для реализации интерфейсов используется ключевое слово implements.
•	Класс Hobby должен быть объявлен с модификатором доступа static.
•	Для доступа к переменной HOBBY нет необходимости создавать объект Dream.
•	Объявления интерфейсов не изменять.
*/

import com.sun.jdi.InterfaceType;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
        ArrayList<Object> interfaceTypes = new ArrayList<>();

        Dream dream = new Hobby();

        Desire desire = new Hobby();// оба интерфейса могут хранить класс реализатор
        interfaceTypes.add(dream);
        interfaceTypes.add(desire);
        if (interfaceTypes.get(0) instanceof Dream) {
            if (dream instanceof Hobby) {
                Hobby hobby = (Hobby) dream;

                System.out.println(hobby.toString());
            }
        }

        // переменная типа интерфейс может хранить в себе класс, который реализует этот самый интерфейс,
        // но не может вызывать в интерфейсе методы и переменные класса который хранит, можно сделать сужение
        // до класса наследника, как показанно выше, с проверкой содержимого интерфейса.

    }

    interface Desire {
        Desire test(String a, int b);
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby(); // В интерфейсе можно создавать объекты класса, в котором
        // интерфейс реализуется
    }

    static class Hobby implements Dream, Desire {



        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }

        public int test() {

            return 0;
        }

        @Override
        public Hobby test(String a, int b) {
            return null;
        }
    }

}
