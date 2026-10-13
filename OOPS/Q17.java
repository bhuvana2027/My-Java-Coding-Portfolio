/*Write a program to create a class called "Rectangle" with width and height
attributes. Calculate the area and perimeter of the rectangle.*/

package Tasks;
class Rectangle{
	double width;
	double height;

	double calculateArea() {
		return height*width;
	}
	double calculatePerimeter() {
		return 2*(width+height);
	}

}
public class Q17 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
			r.width=10;
			r.height=5;
		System.out.println("Width= "+r.width);
		System.out.println("Height= "+r.height);
		System.out.println("Area= "+r.calculateArea());
		System.out.println("Perimeter= "+r.calculatePerimeter());
	}

}
