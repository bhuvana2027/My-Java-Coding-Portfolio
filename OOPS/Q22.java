/*A professor at a university both teaches students and conducts research.
Create a class for the professor that can do both*/

package Tasks;
interface Teaching{      //Interface-1
	void teach();
    }
interface Research {       //Interface-2
	void conductResearch() ;
	  
  }
class professor implements Teaching, Research{   //Professor -class 
	 public void teach() {
		 System.out.println("Professor Teaches Student");
	    }
	 public void conductResearch() {
		 System.out.println("Professor conducts Research");
	 }
}

public class Q22 {

	public static void main(String[] args) {
		professor p=new professor();
			p.teach();
			p.conductResearch();

	}

}
