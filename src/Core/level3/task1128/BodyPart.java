package Core.level3.task1128;

public final class BodyPart {
    // это не просто переменные это объекты класса
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart CHEST = new BodyPart("грудь");

    private String bodyPart; // сюда записывается название части тела

    private BodyPart(String bodyPart) { // это конструктор класса, в котором создаются выше обозначенные объекты.
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart; // этот метод пробрасывает название части тела до метода doMove
    }
}
