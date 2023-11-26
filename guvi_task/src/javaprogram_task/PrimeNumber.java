package javaprogram_task;
import java.util.*;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			
			System.out.println("Enter the number to be checked for prime: ");
			Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();							//read input from user
			int prime = 0;									// Holds the count of values
			if (n <= 1) 									// There is no prime number less than 2.
		    {
		      System.out.println("The number is not prime");
		      return;
		    }
		    for (int i=1; i<= n/2; i++) 					// to check the number is prime or not
		    {
		      if (n%i==0) 
		      {
		        prime++;
		      }
		    }
		    if(prime>1)
		    	System.out.println("The entered number is not a prime number");
		    else
		    	System.out.println("The entered number is a prime number");
		    sc.close();
	}

}  
