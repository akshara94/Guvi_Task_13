package guviTask10_;

public class Greentea6 extends Tea6
{

	public static void main(String[] args)
	{
		
	
	 Tea6 obj1 = new Tea6();
	    obj1.water();
	    obj1.Teapowder();
	    obj1.Milk();
	    obj1.Preparetea();
	    
	    System.out.println("-----------------------------");
	    
	    
	    Greentea6 obj3 = new Greentea6();
	    obj3.water();
	    obj3.Teapowder();
	    obj3.Milk();
	    obj3.greenleaves();
	    obj3.Preparetea();
	}
	    
	   
		public void greenleaves()
		{
			System.out.println("add the water and leveas.");
			
		}
		public void Preparetea()//Overridden
		{
			System.out.println("prepare the greentea.");
		}
}


