package task9pgm;
import java.util.*;
public class StarPattern 
{

public static void main(String[] args) 
{
	// TODO Auto-generated method stub
	
	int i, j, n;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the number of rows you want to print: ");  
	n = sc.nextInt();              
	for (i= 0; i<n ; i++)  
	{  
		for (j=0; j<n; j++)  
		{  
			if(i==j|| i+j==n-1 )
				{
				System.out.print("*");   
				}
			else
			{
				System.out.print(" ");
			}
		}   
		System.out.println("");   
	}   
	sc.close();
}  
		  
}  
