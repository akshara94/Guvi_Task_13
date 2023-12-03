package task9pgm;
import java.util.Scanner;
public class switch1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		System.out.println("Enter the month of stay: ");
		Scanner sc = new Scanner(System.in);
	 	int a = sc.nextInt();
	 	if(a>=1 && a<=12) 				// to check if the month entered is correct
	 	{
        System.out.println("Enter the tariff: ");
        float b =sc.nextFloat();
        System.out.println("Enter the number of days of stay: ");
        int c = sc .nextInt();
        float x=(float) (1.2*b);
        switch(a) 						// Switch cases generated
        {
        case 4:
          	System.out.println(" Hotel Traiff : Rs. " +(x*c));
    		break;
        case 5:
    	 	System.out.println(" Hotel Traiff : Rs. " +(x*c));
			break;
        case 6:
        	System.out.println(" Hotel Traiff : Rs. " +(x*c));
			break;
        case 11:
        	System.out.println(" Hotel Traiff : Rs. " +(x*c));
			break;
        case 12:
        	System.out.println(" Hotel Traiff : Rs. " +(x*c));
			break;
     default:
       		System.out.println("Hotel Traiff : Rs. " +(b*c));
    		
    	}
        		
    	sc.close();
	 	}
	 	else
    	{
	  	System.out.println("Invalid month entered!");
    	}
    }
    
}
//}
    
	


