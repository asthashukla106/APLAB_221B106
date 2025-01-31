public class Voice {
    private Object[] animals = new Object[3];

    public void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        
    }

    public void hear() {
        for (Object animal : animals) 
        {
            if (animal instanceof Cow)
            {
                ((Cow) animal).makeVoice();
            } else if (animal instanceof Dog)
            {
                ((Dog) animal).makeVoice();
            } else if (animal instanceof Pig) 
            {
                ((Pig) animal).makeVoice();
            } 
            
        }
    }
}