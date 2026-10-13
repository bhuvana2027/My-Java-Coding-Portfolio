//Program to Show Overriding of Methods in Classes


package Tasks;
class Animal3 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class dog9 extends Animal3 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Animal3 a = new Animal3();
        a.sound();

        dog9 d = new dog9();
        d.sound();
    }
}