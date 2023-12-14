package task10;
;
public class Account
{
	private double balance;
	
	public Account()
	{
		balance = 0;
		
	}
	public Account(double initalbalance)
	{
		balance = initalbalance;
		
	}
	public void deposit(double amount)
	{
		balance += amount;
		
	}
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	public double getbalnce()
	{
		return balance;
	}
}

		  