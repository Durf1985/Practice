package Core.level5.task1220;

public abstract class DrinkMaker {


    public abstract void getRightCup(); // выбрать подходящую чашку

    public abstract void putIngredient(); // положить ингредиенты

    public abstract void pour(); // залить жидкостью

    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }


}
