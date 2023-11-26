package javaprogram_task;
import java.util.Scanner;
public class Stringcalculate 
{
	public static void main(String[] args) 
	{
													// TODO Auto-generated method stub
			System.out.println("Enter the string: ");
			Scanner sc = new Scanner(System.in);  
	        String s = sc.nextLine();
	        int l= s.length();
			System.out.println("The string length is: " +l);
			sc.close();
	}

}
