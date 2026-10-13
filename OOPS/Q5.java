//Program to Show Overloading of Methods in Class

package Tasks;
	class calcular{
		int add(int a, int b) {
			return a+b;
		}
	
	double add(double a,double b) {
		return a+b;
	}

	}

public class Q5 {

	public static void main(String[] args) {
		calcular c=new calcular();
		System.out.println(c.add(10,20));
		System.out.println(c.add(10.5,20.5));
	}

}
