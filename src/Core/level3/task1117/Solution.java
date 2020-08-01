package Core.level3.task1117;

/*
The weather is fine

1. В классе Today реализовать интерфейс Weather.
2. Подумай, как связан параметр type с методом getWeatherType().
3. Интерфейсы Weather и WeatherType уже реализованы в отдельных файлах.

Требования:
•	Интерфейс Weather должен быть реализован в классе Today.
•	В классе Today должен быть реализован метод getWeatherType объявленный в интерфейсе Weather.
•	Тип возвращаемого значения метода getWeatherType должен быть String.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        // создается класс Today в его конструктор передается строка взятая из интерфейса WeatherType
        // далее не явно вызывается метод toString класса Today, в котором происходит вызов метода getWeatherType()
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type; // интерфейс WeatherType не имплементируется, и к нему обращаются, как к своеобразному ENUM
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {// этот метод реализуется, потому что этого требует интерфейс Weather
            return type;
        }
    }
}
