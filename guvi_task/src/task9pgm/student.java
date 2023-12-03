package task9pgm;
import java.util.Scanner;
public class student 
{
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
	
		System.out.println("Enter the marks obtained: ");
		Scanner sc = new Scanner(System.in);
		int marks= sc.nextInt();
     		    if(marks<50)
     		    {  
			        System.out.println("F");  
			    }  
			    else if(marks>=50 && marks<=59)
			    {  
			        System.out.println(" E ");  
			    }  
			    else if(marks>=60 && marks<=69)
			    {  
			        System.out.println(" D ");  
			    }  
			    else if(marks>=70 && marks<=79)
			    {  
			        System.out.println(" C ");  
			    }  
			    else if(marks>=80 && marks<=89)
			    {  
			        System.out.println(" B ");  
			    }
			    else if(marks>=90 && marks<=99)
			    {  
			        System.out.println(" A ");  
			    }
			    else if(marks==100) 
			    {
			    	System.out.println(" S ");
			    }
			    else
			    {  
			          System.out.println("Invalid!"); 
			    }  
     		    sc.close();
			}  
}  