/*. Write a Java program to create a class called Employee with methods called
work() and getSalary()*/

package Tasks;
	class employee{
		void work() {
			System.out.println("Employee is working");
		}
	
		int getSalary() {
			return 25000;
		}
	}
public class Q2 {

	public static void main(String[] args) {
		employee e=new employee();
		e.work();
		System.out.println("Salary= "+e.getSalary());

	}
}

