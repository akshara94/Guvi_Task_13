package task9pgm;
import java.util.*;
public class NumberPattern 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 System.out.print("Enter the number of rows you want to print: "); 
		 Scanner sc = new Scanner(System.in);  
         int n = sc.nextInt();  
		 int number = 1;
		        for (int i = 1; i <= n; i++)
		        {
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print(number + " ");
		                number++;
		            }
		            System.out.println();
		         } 
		   sc.close();     
	}	
		
}


