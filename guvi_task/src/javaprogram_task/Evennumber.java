package javaprogram_task;
import java.util.*;
public class Evennumber 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter the number to be checked: "); 			//taking input from user
		Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt(); 	
        if(n%2==0)
        	System.out.println("Then entered number is Even");
		else
			System.out.println("The entered number is Odd");
        sc.close(); 
	}
}
