/*Write a program to create a class called "Dog" with a name and breed.
Create two instances of the "Dog" class to set and modify the attributes
and print the updated values*/

package Tasks;
class Dog1{
	String name;
	String breed;

Dog1(String name,String breed){
	this.name=name;
	this.breed=breed;
	
}
}
public class Q26 {

	public static void main(String[] args) {
		Dog1 d1=new Dog1("Tommy","Labrador");
		Dog1 d2=new Dog1("Bruno","Golden retriver");
		
		d1.name="Chintu";
		d2.breed="German shepherd";

		System.out.println(d1.name + " - " + d1.breed);
        System.out.println(d2.name + " - " + d2.breed);
	}

}
