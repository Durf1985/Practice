package syntax.level05.task920;

/*
Создать класс прямоугольник (Rectangle).
 Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)

Требования:
•	У класса Rectangle должны быть переменные top, left, width и height с типом int.
•	У класса должен быть хотя бы один конструктор.
•	У класса должно быть хотя бы два конструктора.
•	У класса должно быть хотя бы три конструктора.
•	У класса должно быть хотя бы четыре конструктора
*/


public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public Rectangle() {
        this.top = 234;
        this.left = 23;
        this.width = 2;
        this.height = 1;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = 0;
    }

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
