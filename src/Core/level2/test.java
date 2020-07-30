package Core.level2;

import java.util.ArrayList;

public class test {


    interface WallBuilder {
        void buildWall();
    }

    static class РабочийРобот implements WallBuilder {
        public void buildWall() {
            System.out.println("Строю рабочий робот");
        }
    }

    static class РоботСторож implements WallBuilder {
        public void buildWall() {
            System.out.println("Строю сторож");
        }
    }

    static class Поливалка {

    }

    public static void main(String[] args) {
        //добавляем всех роботов в список
        ArrayList robots = new ArrayList();
        robots.add(new РабочийРобот());
        robots.add(new РоботСторож());
        robots.add(new Поливалка());

        //строить стену, если есть такая способность
        for (Object robot : robots) {
            if (robot instanceof WallBuilder) {
                WallBuilder builder = (WallBuilder) robot;
                builder.buildWall();
            }
        }
        for (Object robot : robots) {
//            robot.b // в данной ссылке можно хранить любого робота, поэтому невозможно обратиться к нужному методу.
        }
    }
}
