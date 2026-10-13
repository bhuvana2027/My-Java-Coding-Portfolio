//Program to Show Use of Super Keyword in Class

package Tasks;
class person1{
	String name="Bhuvana";
	int age=21;
}
	class Employee2 extends person1{
		void display() {
			System.out.println(super.name);
			System.out.println(super.age);
	}
public class Q13 {

	public static void main(String[] args) {
		Employee2 e=new Employee2();
		e.display();

	}
}
}
