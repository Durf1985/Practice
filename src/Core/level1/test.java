package Core.level1;

public class test {
    // АГРЕГАЦИЯ
    public static void main(String[] args) {
        test t = new test();

        Engine e = t.new Engine();// Создали двигатель
        Car car = t.new Car(e);// запихнули двигатель в автомобиль.
        // если удалить объект car, то двигателю будет без разницы он как продолжал существовать, так и продолжает
    }

    class Engine {
    }

    class Car {
        Engine e;

        public Car(Engine e) {// вот этот момент запихивания
            this.e = e;
        }
    }
}
