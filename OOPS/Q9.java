//Program to Show Abstraction in Class
package Tasks;
abstract class foodOrder{
	abstract void order();
	abstract void makePayment();
	abstract void trackOrder();
   }
 class SwiggyOrder extends foodOrder{
	 void order() {
		 System.out.println("Online food ordered-Swiggy");
		 System.out.println("Order place");
	     }
	 void makePayment() {
		 System.out.println("payment Done");
     	 }
	 void trackOrder() {
		 System.out.println("Order is been Tracked");
	 }
 }
 

public class Q9 {

	public static void main(String[] args) {
		foodOrder food=new SwiggyOrder();
			food.order();
			food.makePayment();
			food.trackOrder();

	}

}
