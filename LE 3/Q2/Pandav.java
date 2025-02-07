abstract class Pandav implements Bharatvanshi, Testable {
    @Override
    public void fight() {
        System.out.println(getClass().getSimpleName() + " is fighting");
    }

    @Override
    public void obey() {
        System.out.println(getClass().getSimpleName() + " is obeying");
    }

    @Override
    public void kind() {
        System.out.println(getClass().getSimpleName() + " is kind");
    }
}