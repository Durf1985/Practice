package Core.level2.task613;

/*
«Исправь код», часть 2
Исправь код, чтобы программа компилировалась.

Требования:
•	Класс Pet должен быть статическим.
•	Класс Pet должен иметь два метода.
•	Метод getChild() должен быть абстрактным.
•	Класс Pet должен быть объявлен с модификатором, который запрещает создавать конкретные объекты этого класса.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Pet pet = new Pet() {
            @Override
            public Pet getChild() {
                return null;
            }
        };
        System.out.println(pet.getName());// проверка, можно ли создать абстрактный класс, статический можно.

    }

    public abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
// та же хрень, что и с прошлым заданием, такое ощущение что оно уже решено...
}
