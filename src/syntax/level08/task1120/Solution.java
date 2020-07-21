package syntax.level08.task1120;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Множество всех животных

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
//        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> result = new HashSet<>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);// этот метод синтаксически более понятен...
//        pets.removeIf(cats::contains); // компилятор предложил заменить на такую запись код который ниже.
        /*while (iterator.hasNext()) {
            Object o = iterator.next();
            if (cats.contains(o)) {
                iterator.remove();
            }
        }*/
    }

    public static void printPets(Set<Object> pets) {
        for (Object o :
                pets) {
            System.out.println(o);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}