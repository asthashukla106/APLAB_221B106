public class Voice2 {
    private Cow cow;
    private Dog dog;
    private Pig pig;
    

    public void prepareVoice() {
        cow = new Cow();
        dog = new Dog();
        pig = new Pig();
        
    }

    public void hear() {
        if (cow != null) cow.makeVoice();
        if (dog != null) dog.makeVoice();
        if (pig != null) pig.makeVoice();
        
    }
}