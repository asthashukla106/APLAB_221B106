class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        soundBehavior = new CanQuack();
        flyBehavior = new canFly();
    }

    @Override
    public void display() {
        System.out.println("I'm a Red Head Duck");
    }
}