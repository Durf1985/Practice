package Core.level2.task919;

/*
Создаем человека
Есть public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).

Требования:
•	Класс Solution должен содержать интерфейс CanFly с одним методом fly().
•	Класс Solution должен содержать интерфейс CanRun с одним методом run().
•	Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
•	Человек должен уметь бегать и плавать.
•	Утка должна уметь летать, плавать и бегать.
•	Пингвин должен уметь плавать и бегать.
•	Самолет должен уметь летать и ездить.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements CanSwim, CanRun, CanFly {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements CanRun, CanSwim {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements CanRun, CanFly {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
