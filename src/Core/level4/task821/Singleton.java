package Core.level4.task821;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
