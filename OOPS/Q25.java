/*Write a program to create a class called "Person" with a name and age
attribute. Create two instances of the "Person" class, set their attributes
using the constructor, and print their name and age*/

package Tasks;
class person3{
	String name;
	int age;
  person3(String name,int age){
	this.name=name;
	this.age=age;
    }
public class Q25 {

	public static void main(String[] args) {
		person3 p1=new person3("Bhuvana",21);
		person3 p2=new person3("Priya",22);
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);

	}
}
}
