/*Write a program to represent a company where a class called Employee
defines a method calculateSalary(), and subclasses Manager and
Developer override it to include their own incentives.*/
  
  package Tasks;
 
class Employee5{
	void calculateSalary() {
      }
}
  class Manager extends Employee5{
	  void calculateSalary() {
		  int basicSalary=25000;
		  int incentives=10000;
		int totalSalary=basicSalary+incentives;
		   System.out.println("Manager Salary= "+totalSalary);
	              }
             }
  class developer extends Employee5{
	  void calculateSalary() {
		  int basicSalary=30000;
		  int incentives=10000;
		 int totalSalary=basicSalary+incentives;
		      System.out.println("Developer Salary= "+totalSalary);
	            }
          }
//main method
  public class Q21 {

	public static void main(String[] args) {
		Employee5 e1=new Manager();
		  e1.calculateSalary();
		Employee5 e2=new developer();
			e2.calculateSalary();

	}
  }

