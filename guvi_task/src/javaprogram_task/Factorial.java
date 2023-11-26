package javaprogram_task;
import java.util.*;
public class Factorial 
{
	public static void main(String[] args) 
	{ 			// TODO Auto-generated method stub
			
		System.out.println("Enter the number to calcculate factorial: "); 			//taking input from user
		Scanner sc = new Scanner(System.in);  
        int num= sc.nextInt(); 
        if(num<1)
        {
        	System.out.println("Enter a valid number more than 0 ");
        	return;
        }
        else
        {
        int fact=1;
        int i;
        for(i=1; i<=num; i++)
        {
        	fact=fact*i;
        }
        System.out.println("The factorial of the given number is " +fact);
        }
        sc.close();
	}

}
