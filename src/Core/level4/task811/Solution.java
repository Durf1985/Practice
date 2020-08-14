package Core.level4.task811;

/*
User, Loser, Coder and Proger
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null; //  интерфейс может содержать вложенный класс.
        // Вложенный класс должен реализовывать интерфейс. Т.е. если есть не реализованный метод, то его нужно реализовать
        // во вложенном классе который наследует интерфейс. Создать объект внутреннего класса без
        // реализации интерфейса нельзя

        String key = null;
        for (int i = 0; i < 4; i++) {
            key = reader.readLine();
            if (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger")) {
                switch (key) {
                    case "user":
                        person = new Person.User(); // присваиваем переменной созданный объект внутреннего класса интерфейса.
                        doWork(person);
                        break;
                    case "loser":
                        person = new Person.Loser();
                        doWork(person);
                        break;
                    case "coder":
                        person = new Person.Coder();
                        doWork(person);
                        break;
                    case "proger":
                        person = new Person.Proger();
                        doWork(person);
                        break;
                }
            } else break;
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) { /*проверяем какой тип объекта и делаем преобразования. в данном случае про
         верять необходимо потому что у каждого класса свое имя метода, которое нужно вызвать, при этом необходимо явное приведение
         к какому то типу даже если мы пытаемся вызвать метод по имени. Т.е. обязательно писать так как написанно в решении
          Это работать не будет, даже при условии что мы обращаемся к конкретному имени метода person.live();
         */
            /*
            Person.User person1 = (Person.User) person;
            person1.live();
            данный код аналогичен ниже написанному*/
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}

