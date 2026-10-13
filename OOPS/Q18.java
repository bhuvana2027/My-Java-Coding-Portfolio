/*Write a Java program to create a class called "Student" with a name,
grade, and courses attributes, and methods to add and remove courses.*/
  package Tasks;
import java.util.ArrayList;
class student5{
	String name;
	char grade;
	ArrayList<String>courseList=new ArrayList<>();


  student5(String name,char grade){   //Paramter constructor
	this.name=name;
	this.grade=grade;
  }
		void addCourse(String course) {
			courseList.add(course);
			System.out.println(course+" Added Successfully");
		   }
		void removeCourse(String course) {
			courseList.remove(course);
			System.out.println(course+"Removed Successfully");
		}
		
		
	void display() {
		System.out.println("Name= "+name);
		System.out.println("Grade= "+grade);
		System.out.println("Course= "+courseList);
	}
}
		public class Q18 {

	public static void main(String[] args) {
		student5 s=new student5("Bhuvana",'A');
		  s.addCourse("Java");
		  s.addCourse("MySQl");
		  s.addCourse("Power BI");
		  s.addCourse("Html");
		  s.addCourse("CSS");
		  s.addCourse("Python");

	System.out.println("\n Before Removing : ");
	s.display();
	
	System.out.println("\n After Removing:");
	s.removeCourse("Python");
	s.display();
	}

}
