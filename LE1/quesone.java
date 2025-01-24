class Mother {
    int x;

    void show() {
        System.out.println("Mother's show()");
    }
}

class Child extends Mother {
   
}

public class quesone {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}
