package javaprogram_task;
import java.util.*;
public class SwapIntegers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the first number: "); 			//taking input from user
		Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt(); 
        System.out.println("Enter the second number: ");			// taking second number
        int j = sc.nextInt(); 		
        int k=0;
        k=n;														//Swapping the values using 3rd variable
        n=j;
        j=k;
        System.out.println("The swapped values are " +n +" and " +j);
        sc.close();
	}
}
