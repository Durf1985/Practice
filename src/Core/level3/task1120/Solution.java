package Core.level3.task1120;


/*
Neo
1. Реализовать интерфейс DBObject в классе User.
2. Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран
"The user's name is Neo, id = 1".
3. Метод toString и метод main менять нельзя.
4. Подумай, что должен возвращать метод initializeIdAndName в классе User.

Требования:
•	Интерфейс DBObject должен быть реализован в классе User.
•	Метод initializeIdAndName должен возвращать корректный объект типа User, объект на котором
производится вызов метода("этот" объект).
•	Метод initializeIdAndName должен устанавливать значения полей id и name согласно переданным ему параметрам.
•	Программа должна выводить на экран: "The user's name is Neo, id = 1"
•	Метод toString не менять.
•	Метод main не менять.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    interface DBObject {
//        String initializeIdAndName(long id, String name); вот с таким данный фокус не работает
        DBObject initializeIdAndName(long id, String name);// а с таким написанием DBO можно заменить на имя класса.
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
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
            // задача на то чтобы обратили внимание, что если в интерфейсе имя интерфейса совпадает
            // с типом возвращаемого объекта, то в этом подобии конструктора при реализации можно заменить
            // тип возвращаемого объекта на имя класса в котором происходит реализация.

            /*Когда реализуешь метод интерфейса в классе, можно переписать тип возвращаемого методом объекта.
            Тип может быть не только типом интерфейса, но и типом класса, который реализует данный интерфейс
             */

            this.id = id;
            this.name = name;
            return this;        }
    }
}
