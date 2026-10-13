/*Write a Java program that creates a class hierarchy for employees of a
company. The base class should be Employee, with subclasses Manager,
Developer, and Programmer. Each subclass should have properties such as
name, address, salary, and job title.Implement methods for calculating
bonuses, generating performance reports, and managing projects.*/

package Tasks;
	class Employee{
		String name;
		String address;
		double salary;
		String JobTitle;
		
	Employee(String name,String address,double salary,String JobTitle){
		
	      this.name=name;
	      this.address=address;
	      this.salary=salary;
	      this.JobTitle=JobTitle;
	   }
	
	
      void calculateBonous() {
    	  System.out.println("Employee Bonus= "+(salary*10.0));
      }
      void manageProject() {
    	  System.out.println(name+"is managing Project and Employee");
      }
      void generatePerformanceReport() {
    	  System.out.println("Performance Report is generated for"+name);
      }
	}
     class manager extends Employee {
      manager(String name,String address,double salary,String JobTitle){
    	  super(name,address,salary,JobTitle);
	   }
	
	
      void calculateBonous() {
    	  System.out.println("Manager Bonus= "+(salary*10.0));
      }
      void manageProject() {
    	  System.out.println(name+"is managing Project and Employee");
      }
      void generatePerformancereport() {
    	  System.out.println("Performance Report is generated for"+name);
      }
     }
      
      
      class Developer extends Employee {
          Developer(String name,String address,double salary,String JobTitle){
        	  super(name,address,salary,JobTitle);
    	   }
    	
    	
          void calculateBonous() {
        	  System.out.println("Developer Bonus= "+(salary*10.0));
          }
          void manageProject() {
        	  System.out.println(name+"is managing Project and Employee");
          }
          void generatePerformancereport() {
        	  System.out.println("Performance Report is generated for"+name);
          }
      }

          class Programmer extends Employee {
              Programmer(String name,String address,double salary,String JobTitle){
            	  super(name,address,salary,JobTitle);
        	   }
        	
        	
              void calculateBonous() {
            	  System.out.println("Programmer Bonus= "+(salary*10.0));
              }
              void manageProject() {
            	  System.out.println(name+"is managing Project and Employee");
              }
              void generatePerformancereport() {
            	  System.out.println("Performance Report is generated  for"+name);
              }
          }

               // main method
          public class Q11{
        	  public static void main(String[] args) {
        		  manager m=new manager("Ravi","Hyderbad",60000,"Project Manager");
        	
        		  Developer d=new Developer("Ramesh","Hyberbad",50000,"Full stack developer");
        	  
        		  Programmer p=new Programmer("Suresh","Hyberbad",50000,"Programmer");
        		  
       		  m.calculateBonous();
       		  m.manageProject();
       		  m.generatePerformanceReport();
       		  
       		  d.calculateBonous();
       		  d.manageProject();
       		  d.generatePerformanceReport();
       		  
       		  p.calculateBonous();
       		  p.manageProject();
       		  p.generatePerformanceReport();
        	  }
          
          }