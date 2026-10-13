//Program to Show Usage of Access Modifier
package Tasks;
class student1{
	private String name="Bhuvana";
	int age=21;
	protected String college="KITS";
	public String location="Kakinada";
	void display() {
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
		System.out.println("College= "+college);
		System.out.println("Location= "+location);
	}

public class Q16 {

	public static void main(String[] args) {
		student1 s=new student1();
	    s.display();
	    System.out.println(s.location);
	    System.out.println(s.age);
	    System.out.println(s.college);

	}
}
}
