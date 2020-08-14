package Core.level4.task45;

/*
Food
1. Реализовать интерфейс Selectable в классе Food.
2. Метод onSelect() должен выводить на экран фразу "The food was selected".
3. Подумай, какие методы можно вызвать для переменной food и какие для selectable.
4. В методе foodMethods вызови методы onSelect, onEat, если это возможно.
5. В методе selectableMethods вызови методы onSelect, onEat, если это возможно.
6. Явное приведение типов не использовать.

Требования:
•	Интерфейс Selectable должен быть реализован в классе Food.
•	Метод onSelect() в классе Food должен выводить на экран фразу "The food was selected".
•	В методе foodMethods должны вызываться методы объекта типа Food.
•	В методе selectableMethods должны вызываться методы доступные у любого объекта реализующего интерфейс Selectable.
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food(); // создаем объект

        Selectable selectable = new Food();/* присваиваем переменной типа интерфейс объект, который реализует интерфейс
         для вызова метода selectable.onEat(), о котором не знает интерфейс, необходимо сделать привести к соответсвующему
         типу, в данном случае это Food, к методу который прописан в интерфейсе можно обращаться не преобразовывая типы
          selectable.onSelect(), потому что он реализован и переопределен классом*/
        Food newFood = (Food) selectable; // преобразование




        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        // вызов возможных методов класса Food, после приведения типов
        food.onSelect();
        food.onEat();

    }

    public static void selectableMethods(Selectable selectable) {
        // вызов возможных методов если использовать переменную типа интерфейс и не приводить типы.
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
