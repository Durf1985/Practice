package Core.level2.task920;


/*
Класс Human и интерфейсы CanRun, CanSwim

Напиши public класс Human(человек) и public интерфейсы CanRun(бежать/ездить), CanSwim(плавать).
Добавь в каждый интерфейс по oдному методу.
Добавь эти интерфейсы классу Human, но не реализуй методы.
Объяви класс Human абстрактным.

Требования:
•	Класс Solution должен содержать интерфейс CanRun с одним методом.
•	Класс Solution должен содержать интерфейс CanSwim с одним методом.
•	Класс Solution должен содержать класс Human.
•	Класс Human должен реализовывать интерфейсы CanRun и CanSwim.
•	Класс Human должен быть абстрактным.
•	Класс Human не должен иметь методов.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public abstract class Human implements CanRun, CanSwim {
// поскольку исходника задания у меня нет, то скорее всего задача была на то, что догадается ли ученик
// что класс должен быть абстрактным
    }

}
