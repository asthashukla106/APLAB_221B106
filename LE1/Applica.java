class Mother {
    static void show() {
        System.out.println("Mother's show()");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Child's show()");
    }
}

public class Applica{
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show();
    }
}
