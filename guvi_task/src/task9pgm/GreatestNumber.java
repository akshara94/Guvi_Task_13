package task9pgm;
import java.util.Scanner;
public class GreatestNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter the first number: ");
		Scanner sc = new Scanner(System.in);
	 	int a = sc.nextInt();
	 	System.out.println("Enter the second number: ");
		int b = sc.nextInt();
	 	System.out.println("Enter the third number: ");
		int c = sc.nextInt();
		if(a>b && a>c) 
		{
			System.out.println("The largest among the entered numbers is "+a);
		}
		else if(b>c&&b>a) 
		{
			System.out.println("The largest among the entered numbers is "+b);
		}
		else
			System.out.println("The largest among the entered numbers is "+c);
		sc.close();
	}

}
