package guviTask10_;

public class Blacktea6 extends Tea6
{

	public static void main(String[] args) 
	{
		  Tea6 obj1 = new Tea6();
		    obj1.water();
		    obj1.Teapowder();
		    obj1.Milk();
		    obj1.Preparetea();
		    
		    System.out.println("-----------------------------");
		    
		    
		    Blacktea6 obj2 = new Blacktea6();
		    obj2.water();
		    obj2.Teapowder();
		    obj2.Milk();
		    obj2.blackteapowder();
		    obj2.preparetea();
		    
		    
		    
			}
			
			
			public void blackteapowder()
			{
				System.out.println("add the water and tea powder.");
				
			}
			public void preparetea()//Overridden
			{
				System.out.println("prepare the blacktea.");
			}
}
		
	
		

	


