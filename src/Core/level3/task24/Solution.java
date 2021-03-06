package Core.level3.task24;

/*
Selectable и Updatable
Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
Не забудь реализовать методы!

Требования:
•	Класс Screen должен реализовывать(implements) интерфейс Selectable.
•	Класс Screen должен реализовывать(implements) интерфейс Updatable.
•	В классе Screen должен быть реализованы методы интерфейса Selectable.
•	В классе Screen должен быть реализованы методы интерфейса Updatable.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }
    public static class Screen implements Selectable,Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }

    //напишите тут ваш класс
}
