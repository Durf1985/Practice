package Core.level5.task1225;


public class Earth implements Planet {
    private static Earth instance;

    private Earth() {

    }

    public static synchronized Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
