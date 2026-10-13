//Program to Create an Interface
package Tasks;

interface PaymentSystem {
    void pay();
}

class UPI implements PaymentSystem {
    @Override
    public void pay() {
        System.out.println("Paid through UPI");
    }
}

class CreditCard implements PaymentSystem {
    @Override
    public void pay() {
        System.out.println("Paid through Credit Card");
    }
}

public class Q10 {
    public static void main(String[] args) {

        UPI u = new UPI();
        u.pay();

        CreditCard c = new CreditCard();
        c.pay();
    }
}