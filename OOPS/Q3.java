/*Create a subclass called HRManager that overrides the work() method and
adds a new method called addEmployee()*/

package Tasks;
 class employee2{
		void work() {
		System.out.println("Employee is Working");

		}
	  }
	class Hrmanager extends employee2{
		void work() {
			System.out.println("Hr manager handles Work");
		}
			void addEmployee() {
				System.out.println("HR manager adds new Employee");
			}
	}

public class Q3 {

	public static void main(String[] args) {
		Hrmanager HR=new Hrmanager();
		HR.work();
		HR.addEmployee();

	}

}
