package guviTask10_;

public class Herbaltea6 extends Tea6
{

	public static void main(String[] args)
	{
		
	
	 Tea6 obj1 = new Tea6();
     obj1.water();
     obj1.Teapowder();
     obj1.Milk();
     obj1.Preparetea();
		    
  System.out.println("-----------------------------");
		    
     Herbaltea6 obj4 = new Herbaltea6();
      obj4.water();
      obj4.Teapowder();
      obj4.Milk();
      obj4.gingertea();
      obj4.preparetea();
}
    public void gingertea()
    {

	System.out.println("add the water and ginger.");
    }
	public void preparetea()//overridden
	{

	System.out.println("prepare the herbaltea.");
	}
}
   



