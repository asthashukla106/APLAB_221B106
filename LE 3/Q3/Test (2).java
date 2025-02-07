public class Test {
    public static void main(String[] args) {
        Duck[] ducks = {
            new RubberDuck(),
            new WoodenDuck(),
            new RedHeadDuck(),
            new LakeDuck()
        };

        for (Duck duck : ducks) {
            duck.display();
            duck.performSwim();
            duck.performSound();
            duck.performFly();
            System.out.println();
        }
    }
}
