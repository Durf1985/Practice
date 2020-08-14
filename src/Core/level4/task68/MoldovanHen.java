package Core.level4.task68;

public class MoldovanHen extends Hen {
    @Override
    public String getDescription() {
        return super.getDescription() +
                " Моя страна - " + Country.MOLDOVA + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 4;

    }
}
