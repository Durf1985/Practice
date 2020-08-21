package Core.level5.task1220;

/*
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker drinkMaker = new TeaMaker();
        drinkMaker.makeDrink();
        DrinkMaker drinkMaker1 = new LatteMaker();
        drinkMaker1.makeDrink();

    }
}
