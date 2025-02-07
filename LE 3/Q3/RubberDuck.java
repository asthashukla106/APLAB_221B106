class RubberDuck extends Duck {
    public RubberDuck() {
        soundBehavior = new CanSquak();
        flyBehavior = new CannotFly();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}