package Core.level4.task46;

/*
Без ошибок
Инициализировать объект obj таким классом, чтобы метод main выполнился без ошибок.

Требования:
•	Класс GrayMouse должен наследоваться от класса Mouse.
•	Класс Jerry должен наследоваться от класса GrayMouse.
•	В переменной obj должен храниться объект который будет одновременно являться и Mouse, и GrayMouse, и Jerry.
•	Метод main должен вызывать метод printClasses.
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry(); // присваиваем объекту самого дальнего потомка, джерри

        Mouse mouse = (Mouse) obj;// преобразовываем джерри в мыша, ведь он мышь
        GrayMouse grayMouse = (GrayMouse) mouse;// преобразовываем мышь в серую мышь, ведь он серая мышь
        Jerry jerry = (Jerry) grayMouse;// преобразовываем серую мышь в мышь джерри
        // преобразование сужающего типа без проверки мышь ли это, серая ли это мышь, и джерри ли это.

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        // Возвращает простое имя базового класса, заданное в исходном коде.
        // Возвращает пустую строку, если базовый класс является анонимным.
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
        // базовым классом считается тот класс который был "new SomeClass()" и не важно какому типу присваивается ссылка.
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}
