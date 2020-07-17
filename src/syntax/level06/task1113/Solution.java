package syntax.level06.task1113;

/*
Кот и статика
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat)
статическая переменная catCount увеличивается на 1. Создать 10 объектов Cat и вывести
значение переменной catCount на экран.

Требования:
•	В классе Cat создай статическую переменную public int catCount.
•	В классе Cat создай конструктор public Cat() без параметров.
•	Конструктор должен увеличивать значение статической переменной catCount на 1.
•	В методе main создай 10 котов.
•	В методе main, после создания всех котов, выведи значение переменной catCount.
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);

        // Выведи значение переменной catCount
    }

    public static class Cat {
        static int catCount;

        public Cat() {
            catCount++; // кста, только сейчас обратил внимание, что не обязательно присваивать значение при объявлении
//             суть задачи, чтобы ученик догадался, как выполнить вот это
//            Пусть при каждом создании кота (нового объекта Cat) catCount++

        }
    }
}
