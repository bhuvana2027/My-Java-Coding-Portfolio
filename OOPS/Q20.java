/*Create a class hierarchy for a school management system with a class
called Teacher for different subjects like Maths, Science, and
English, and implement the teaching in different ways*/


package Tasks;
class Teacher{
	void teach() {
		System.out.println("Teacher teaches a Subject");
	       } 
         }
	class MathsTeacher extends Teacher{
		void teach() {
			System.out.println("Maths teacher teaches using Formula and solve Problems");
		}
	      } 
	class scienceTeacher extends Teacher{
		void teach() {
			System.out.println("Science teacher teaches by doing different experiments");
		}
	       }

	class EnglishTeacher extends Teacher{
		void teach() {
			System.out.println("English teacher teaches Grammar and speaking");
		}
	}
//Main Method
public class Q20 {

	public static void main(String[] args) {
		Teacher t1=new MathsTeacher();
			t1.teach();
		Teacher t2=new scienceTeacher();
			t2.teach();
		Teacher t3=new EnglishTeacher();
			t3.teach();

	}

}
