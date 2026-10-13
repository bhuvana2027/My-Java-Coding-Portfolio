//Program to Show Polymorphism in Class
package Tasks;

class animal{

    void speak() {
        System.out.println("Animal speak");
    }
}

class Dog2 extends animal {
    void speak() {
        System.out.println("Dog Bark");
    }
}

class Cat3 extends animal {
    void speak() {
        System.out.println("Cat meow");
    }
}

class Cow extends animal {
    void speak() {
        System.out.println("Cow moo");
    }
}

public class Q4 {

    public static void main(String[] args) {

        animal a = new animal();
        a.speak();

        animal d = new Dog2();
        d.speak();

        animal c = new Cat3();
        c.speak();

        animal b = new Cow();
        b.speak();
    }
}
