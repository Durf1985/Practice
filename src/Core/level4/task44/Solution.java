package Core.level4.task44;

/*
Коты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.

Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна прекращать считывать данные после ввода пустой строки.
•	Программа должна выводить на экран описание каждого кота (cat.toString).
•	Программа должна создавать объект класса Cat для каждого введенного имени кота(строки считанной с клавиатуры)
c помощью метода getCatByKey.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            // вызывается метод, который возвращает ссылку на созданный объект кот
            Cat cat = CatFactory.getCatByKey(s);
            System.out.println(cat.toString());
        }


    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
                // присваивается наследник. Присваивается частный случай.
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");

            } else {
                cat = new Cat(key);// присваивается общий случай
            }
            return cat;
        }
    }

    // честно говоря не понимаю, зачем здесь наследование от фабрики котов, если только соблюдение формальной логики
    static class Cat extends CatFactory {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }  // используется конструктор родителя, чтобы не плодить поля класса.

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        } // можно написать через this.getName
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }

        public void namae() {
            System.out.println("namae");
            /* Без подобного приведения типов этот метод не будет вызываться, т.к. о нем родитель не знает

            if (cat instanceof FemaleCat) {
                    FemaleCat f = (FemaleCat) cat;
                    f.namae();
                }*/
        }
    }
}
