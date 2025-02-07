class WoodenDuck extends Duck {
    public WoodenDuck() {
        soundBehavior = new IsMute();
        flyBehavior = new CannotFly();
    }

    @Override
    public void display() {
        System.out.println("I'm a Wooden Duck");
    }
}