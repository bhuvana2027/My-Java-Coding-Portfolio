//Program to Show Use of This Keyword in Class
package Tasks;
class Bank{
	String name;
	String Address;
  Bank(String name,String Address){
	  this.name=name;
	  this.Address=Address;
  }
	  void display() {
	 System.out.println("Name= "+name);
	 System.out.println("Location= "+Address);
  }
 
}
public class Q14 {

	public static void main(String[] args) {
		Bank b=new Bank("SBI","Kakinada");
		  b.display();

	}

}
