class LazySingleton {
    private static LazySingleton instance;
    private static int instanceCounter = 0;
    private LazySingleton() {
        instanceCounter++;
        System.out.println("Instance Created. Instance count: " + instanceCounter);
    }
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        } else {
            System.out.println("Attempt to create another instance. Instance count: " + instanceCounter);
        }
        return instance;
    }
}
public class SimpleMain {
    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println("Instance 1: " + instance1);
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println("Instance 2: " + instance2);
    }
}
