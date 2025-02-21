class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private static int instanceCounter = 0;
    private EagerSingleton() {
        instanceCounter++;
        System.out.println("Instance Created. Instance count: " + instanceCounter);
    }
    public static EagerSingleton getInstance() {
        if (instanceCounter > 1) {
            System.out.println("Attempt to create another instance. Instance count: " + instanceCounter);
        }
        return instance;
    }
}
public class EagerSolution {
    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        System.out.println("Instance 1: " + instance1);
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println("Instance 2: " + instance2);
    }
}
