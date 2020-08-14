package Core.level4.task89;

/*
Мосты
1. Создать интерфейс Bridge с методом int getCarsCount().
2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
3. Метод getCarsCount() должен возвращать любое фиксированное значение типа int.
4. Метод getCarsCount() должен возвращать различные значения для различных классов.
5. В классе Solution создать публичный метод println(Bridge bridge).
6. В методе println вывести на консоль значение getCarsCount() для объекта bridge.
7. Каждый класс и интерфейс должны быть в отдельных файлах.

Требования:
•	Интерфейс Bridge должен быть создан в отдельном файле.
•	Классы WaterBridge и SuspensionBridge должны быть созданы в отдельных файлах.
•	Классы WaterBridge и SuspensionBridge должны реализовывать интерфейс Bridge.
•	Метод getCarsCount() должен возвращать различные значения типа int для различных классов,
но всегда фиксированное(константное) значение для разных объектов одного и того же класса.
•	В классе Solution должен быть реализован публичный(public) метод println c одним параметром типа Bridge.
•	Метод println должен выводить на консоль количество машин(результат работы метода
getCarsCount) для переданного ему моста(объекта типа Bridge).
•	В интерфейсе Bridge должен быть определен метод int getCarsCount().
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());     // вызываем метод и динамически создаем мост определенного типа
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
        // вообще ниже написанный код непонятно для чего тут нужен, потому что у нас нет явного преобразования
        // а код конкретных классов моста содержит только те методы которые определены в интерфейсе, следовательно
        // наш интерфейс типа Brige может обратиться абсолютно ко всем методам объекта, так что не знаю зачем я так написал
//        if (bridge instanceof WaterBridge) { // проверяем, какого типа мост у нас хранится в переменной интерфейса
//            System.out.println(bridge.getCarsCount());
//        } else if (bridge instanceof SuspensionBridge) {
//            System.out.println(bridge.getCarsCount());
//        }

    }
}

