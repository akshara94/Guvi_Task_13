package javaprogram_task;
import java.util.Scanner;
public class SeniorCitizen 
{

	public static void main(String[] args) 
	{ 							// TODO Auto-generated method stub
		System.out.println("Enter the age of the person: "); 			//taking input from user
		Scanner sc = new Scanner(System.in);  
        int age= sc.nextInt();
        if(age<=0)														// To ensure invalid age is not entered
        {	
        	System.out.println("Please enter a valid age");	
        }   
        else if(age>=60)
              
             	System.out.println("The person is Senior Citizen.");
             else
            	System.out.println("The person is not a Senior Citizen ");
        sc.close();
	}

}
