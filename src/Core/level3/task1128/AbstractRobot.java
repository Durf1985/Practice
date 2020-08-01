package Core.level3.task1128;

public abstract class AbstractRobot implements Attackable, Defensable {
    // интерфейсы нужны только для того, чтобы мы не забыли описать 2 действия атаку и защиту.
    private static int hitCount;// инициализирована нулем
    private String name; //присваивается в момент создания робота.

    public AbstractRobot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  BodyPart attack() {
        BodyPart attackedBodyPart = null; // мы не знаем какая часть будет атакована
        hitCount = hitCount + 1; // честно говоря лучше использовать Math.random

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM; // мы присвоили переменной объект
            hitCount= 4;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
            hitCount++;
        } else if (hitCount == 3) {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount > 3) {
            attackedBodyPart = BodyPart.CHEST;
            hitCount = 1;

        }
        return attackedBodyPart; // тут мы возвращаем этот объект методу который вызвал
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        }else if (hitCount >3){
            defendedBodyPart = BodyPart.CHEST;
            hitCount = 3;
        }
        return defendedBodyPart; // логика аналогична
    }
}
