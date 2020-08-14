package Core.level4.task68;

/*
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        // вызываем метод класса, который должен вернуть определенную курицу и присвоить ее абстрактному классу
        // передаем в метод класса строку взятую из интерфейса в роли константы.
        Hen hen = HenFactory.getHen(Country.BELARUS);
        // ни один класс не реализует интерфейс, но к его переменным можно обращаться.
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country) { // в зависимости от переданной строки выбирается тип наследника
                case Country.BELARUS:
                    hen = new BelarusianHen(); // если строка содержит "Belarus" то создать объект BelarusianHen
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
            }
            return hen;
        }
    }


}
