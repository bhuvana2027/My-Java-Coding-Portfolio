//Write a program to explain Dynamic Binding
package Tasks;

class Animal6 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog6 extends Animal6 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat6 extends Animal6 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Q12 {
    public static void main(String[] args) {
        Animal6 a;

        a = new Dog6();
        a.sound();

        a = new Cat6();
        a.sound();
    }
}
