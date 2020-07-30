package Core.level2.task917;

/*
Лететь, бежать и плыть
Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавить в каждый интерфейс по одному методу.

Требования:
•	Класс Solution должен содержать интерфейс CanFly.
•	Класс Solution должен содержать интерфейс CanRun.
•	Класс Solution должен содержать интерфейс CanSwim.
•	Интерфейс CanFly должен содержать один метод.
•	Интерфейс CanRun должен содержать один метод.
•	Интерфейс CanSwim должен содержать один метод.
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

}
