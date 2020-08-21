package Core.level5.task1225;

public class Sun implements Planet {
    private static Sun instance;

    private Sun() {

    }

    public static synchronized Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
