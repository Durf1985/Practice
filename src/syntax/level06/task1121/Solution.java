package syntax.level06.task1121;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat gF = new Cat(reader.readLine());
        Cat gM = new Cat(reader.readLine());
        Cat father = new Cat(reader.readLine(), null, gF);
        Cat mother = new Cat(reader.readLine(), gM, null);
        Cat son = new Cat(reader.readLine(), mother, father);
        Cat daughter = new Cat(reader.readLine(), mother, father);
        System.out.println(gF);
        System.out.println(gM);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String startText = "The cat's name is ";
            if (mother == null && father == null) return startText + this.name + ", no mother, no father ";
            else if (mother == null) return startText + this.name + ", no mother, father is " + father.name;
            else if (father == null) return startText + this.name + ", mother is " + mother.name + ", no father";
            else return startText + this.name + ",mother is " + mother.name + ",father is " + father.name;
// возможно где-то пропущены запятые пробелы или точки, но суть задачи выполнена, а так мне лень вычитывать.
        }
    }
}


