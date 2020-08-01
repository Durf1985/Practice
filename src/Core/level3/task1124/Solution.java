package Core.level3.task1124;


import java.awt.*;

/*
Один метод в классе
1. Унаследовать Fox от интерфейса Animal.
2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
3. Методы удалять нельзя!

Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В классе Fox должен быть реализован только один метод(getName).
•	В интерфейсе Animal должен быть объявлен метод getColor.
•	Дополнительные классы или интерфейсы создавать нельзя.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        default void getColor() { // скорее всего надо было объявить методы дефолтными.

        }

        default void getAge() {

        }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
