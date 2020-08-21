package Core.level5.task1225;

public class Test implements Planet {
    private static volatile Test test;

    public static synchronized Test getInstance() {
        Test localtest = test;
        if (localtest == null) {
            synchronized (Test.test) {
                localtest = test;
                if (localtest == null) {
                    test = localtest = new Test();
                }
            }
        }
        return localtest;
    }
}
