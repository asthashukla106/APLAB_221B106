class Animal {
    private String name;
    private String voice;

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public void makeVoice() {
        System.out.println(voice);
    }
}