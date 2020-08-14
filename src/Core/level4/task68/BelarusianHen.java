package Core.level4.task68;

public class BelarusianHen extends Hen {
    // наследует абстрактный класс Hen, который обязывает нас реализовать метод абстрактный метод getCountOfEggsPerMonth()
    @Override
    public String getDescription() { // можно не переопределять, но тогда будет вызван метод определенный в родительском классе.
        return super.getDescription() + // вызываем метод родительского класса, который возвращает строку "я курица"
                " Моя страна - " + Country.BELARUS + ". Я несу " // берется константа из интерфейса
                + getCountOfEggsPerMonth() + " яиц в месяц."; // вызывается метод, который нас обязали реализовать.
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 5; //    просто рандомное число

    }
}
