/*Create a class with BankAccount, and it is an abstract class which
consists of methods like deposit and withdrawal, and provide the specific
concrete classes to implement*/

package Tasks;
abstract class BankAccount{
	abstract void deposit();
	abstract void withdraw();
}
  class SBIBankAccount extends BankAccount{
	  void deposit() {
		  System.out.println("Deposit successfully");
	    }
	  void withdraw() {
		  System.out.println("Withdraw successfully");
	  }
  }

public class Q19 {

	public static void main(String[] args) {
		BankAccount bank=new SBIBankAccount();
			bank.deposit();
			bank.withdraw();

	}

}
