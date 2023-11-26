package javaprogram_task;
import java.util.*;
public class ifcondition 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Enter the first integer: "); 			//taking integer input from user
		Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt(); 
        System.out.print("Enter the second integer: "); 
        int b = sc.nextInt();
        System.out.print("Enter the third integer: "); 
        int c = sc.nextInt();
        System.out.print("Enter the fourth integer: "); 
        int d = sc.nextInt();
		int i = a+b; 
		int j= c+d; 
		if(i>j)
			System.out.println("The sum of " +a +" and " +b +" is greater than the sum of " +c +" and " +d ) ;
		else
			System.out.println("The sum of " +c +" and " +d +" is greater than the sum of " +a +" and " +b );
		
		sc.close(); 
	}
	 
}


