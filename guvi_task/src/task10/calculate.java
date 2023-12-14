package task10;

public class calculate extends Account
{

	public static void main(String[] args)
	{
		calculate cal = new calculate();
		Account acc = new Account (1000);
		
		
		cal.deposit(5000);
		cal.withdraw(1000);
		System.out.println("How much in account balance  = " + cal.getbalnce());
	
		acc.deposit(5000);
		acc.withdraw(1000);
		System.out.println(" Total account balance  = " + acc.getbalnce());
	}
}