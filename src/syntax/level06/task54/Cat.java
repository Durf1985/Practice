package syntax.level06.task54;

/*
Ставим котов на счётчик
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов
(статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.

Требования:
•	Добавь в класс Cat конструктор без параметров public Cat().
•	Конструктор класса должен на 1 увеличивать значение переменной catCount.
•	Добавь в класс Cat метод finalize.
•	Метод finalize ничего не должен возвращать (тип возвращаемого значения void).
•	Метод finalize должен уменьшать переменную catCount на 1.
*/

public class Cat {
    public static int catCount = 0;

    public Cat() {
        catCount++;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(Cat.catCount);
        cat.finalize();
        System.out.println(Cat.catCount);
    }

    protected void finalize() {
        catCount--;
    }
}
