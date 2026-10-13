/* Create a base Vehicle class with properties like make, model, and year,
then create subclasses for Car, Motorcycle, and Truck with specific
attributes*/


package Tasks;
class Vehicle{            //Parent class
	String make;
	String model;
	int year;

	Vehicle(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}

	void displayVehicle() {
		System.out.println("Make= "+make);
		System.out.println("Model= "+model);
		System.out.println("Year= "+year);
	    }
}
    class car extends Vehicle{      //child class-1
	    int numberofDoors;
	    car(String make,String model,int year,int numberofdoors){
	    	super(make,model,year);
	    	this.numberofDoors=numberofdoors;
	       }
        void display() {
        	displayVehicle();
        	System.out.println("No of Doors= "+numberofDoors);
                }
                      }
    class MotorCycle extends Vehicle{      //child class-2
	    boolean hassidecar;
	    MotorCycle(String make,String model,int year,boolean hassidecar){
	    	super(make,model,year);
	    	this.hassidecar=hassidecar;
	       }
        void display() {
        	displayVehicle();
        	System.out.println("Does it has Side car= "+hassidecar);	
	           }
                   }  
    class truck extends Vehicle{      //child class-3
	    double loadcapacity;
	    truck(String make,String model,int year,double loadcapacity){
	    	super(make,model,year);
	    	this.loadcapacity=loadcapacity;
	       }
        void display() {
        	displayVehicle();
        	System.out.println("Load capacity= "+loadcapacity);
        }
    }
  //Main method
  public class Q23 {

	public static void main(String[] args) {
		car cr=new car("Toyota","corolla",2025,4);
		MotorCycle Mc=new MotorCycle("Honda","shine",2024,false);
		truck t=new truck("Tata","Prima",2025,10.5);

		System.out.println("\n--------Car details------");
			cr.display();
		System.out.println("\n--------Motor cycle details-----");
		    Mc.display();
		System.out.println("\n-------truck details-----");
			t.display();
	}
  }

