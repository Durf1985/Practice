package Core.level3.task26;

/*
Баг в initializeIdAndName
1. Подумать, что в программе неправильно.
2. Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Поправить программу, чтобы компилировалась и работала.

Требования:
•	Интерфейс DBObject должен содержать только объявление метода initializeIdAndName без реализации.
•	Реализуй метод initializeIdAndName в классе User.
•	Метод initializeIdAndName в классе User должен иметь тип возвращаемого значения User.
•	Метод initializeIdAndName должен присваивать значения полям id и name объекта типа User в соответствии
 с переданными ему параметрами и возвращать этот объект.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO); // обращение к статичной переменной класса
        System.out.println(Matrix.TRINITY);

    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class Matrix {// класс
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        // это переменные класса, тип статик, к ней можно обратиться без создания объекта.
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
        // создается  переменная типа интерфейс, которой присваивается объект имплементирующий этот интерфейс
        //  при создании объекта вызывается переопределенный метод интерфейса, в котором изменен тип возвращаемого
        //  значения на имя класса, в котором реализуется интерфейс.
        // больше всего напоминает работу конструктора или инициализацию объектов и переопределение(изменяется
        // тип возвращаемого значения), в одном флаконе.
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            // больше всего это напоминает инициализацию, только мы переопределяем тип возвращаемого объекта
            this.id = id;
            this.name = name;
            return this; // возврат ссылки на текущий объект типа User.
        }
    }

}
