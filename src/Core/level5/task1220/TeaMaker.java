package Core.level5.task1220;

public class TeaMaker extends DrinkMaker {
    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    public void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    public void pour() {
        System.out.println("Заливаем кипятком");
    }

//    public void makeDrink() { //интересно зачем я переопределил этот метод в наследнике? Возможно требование валидатора
//        getRightCup();
//        putIngredient();
//        pour();
//    }

}
