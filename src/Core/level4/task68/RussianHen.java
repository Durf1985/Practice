package Core.level4.task68;


public class RussianHen extends Hen {
    @Override
    public String getDescription() {
        return super.getDescription() +
                " Моя страна - " + Country.RUSSIA + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 2;

    }
}
