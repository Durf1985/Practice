package Core.level3.task21;

/*
Пиво
1. Подумай, какой из двух интерфейсов нужно реализовать в классе BeerLover.
2. Добавь к классу BeerLover этот интерфейс и реализуй все его методы.
3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.

Требования:
•	Класс BeerLover должен реализовывать(implements) интерфейс Alcoholic.
•	Класс BeerLover не должен реализовывать интерфейс Drinker напрямую(только опосредованно через Alcoholic)
•	В классе BeerLover должны быть реализованы все методы интерфейса Alcoholic.
•	В классе BeerLover должны быть реализованы все методы интерфейса Drinker.
•	Метод isReadyToGoHome должен возвращать значение переменной READY_TO_GO_HOME.
*/
public class Solution {
    public static void main(String[] args) throws Exception {

        BeerLover beerLover = new BeerLover();
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }


    public interface Alcoholic extends Drinker{
        boolean READY_TO_GO_HOME = false; //считается final переменной!!!
        // Переменные можно объявлять в интерфейсах, но они не явно считаются final


        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {

        @Override
        public void askForMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME; // ее можно только вернуть
        }

        @Override
        public void sleepOnTheFloor() {

        }

    }
}
