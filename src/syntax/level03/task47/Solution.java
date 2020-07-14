package syntax.level03.task47;

/*
Привет StarCraft!
Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.

Требования:
•	Нельзя изменять классы Zerg, Protoss и Terran.
•	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
•	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
•	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.

*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // да-да, никто не сказал, что они должны жить долго))
            String name1 = "" + i;
            Zerg zerg = new Zerg();
            zerg.name = name1;
        }
        for (int i = 0; i < 3; i++) {
            String name1 = "" + i;
            Protoss protoss = new Protoss();
            protoss.name = name1;

        }
        for (int i = 0; i < 4; i++) {
            String name1 = "" + i;
            Terran terran = new Terran();
            terran.name = name1;


        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
