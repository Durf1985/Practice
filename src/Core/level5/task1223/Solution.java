package Core.level5.task1223;

/*
Тренировка мозга
*/

public class Solution {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static interface CanFly {
        void doAction();
    }

    public static interface CanMove {
        void doAnotherAction();
    }

    public static class Duck implements CanFly, CanMove {
        @Override
        public void doAction() {
            System.out.println("Flying");
        }

        @Override
        public void doAnotherAction() { // методы должны быть публичными
            System.out.println("Moving");
        }
    }

    public static class Util {
        static void fly(CanFly animal) {
            animal.doAction();
        }

        static void move(CanMove animal) { // может принять утка = новая_утка, потому что реалзиует этот интерфейс
            animal.doAnotherAction();
        }
    }
}
