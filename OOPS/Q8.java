/*Create a subclass called Employee that adds a new method named
getEmployeeId() and overrides the getLastName() method to include the
employee's job title.*/

package Tasks;
	class person{
		String getlastname() {
			return "kalla";
		}
	  }
	class employee1 extends Person{
		String getLastName() {
			return "Kalla-Software Engineer";
		}
	  
	    int getEmployeeID() {
	    	return 101;
	    }
	    }
public class Q8 {

	public static void main(String[] args) {
		employee1 e=new employee1();
		System.out.println(e.getLastName());
		System.out.println(e.getEmployeeID());
	}

}
