package guviTask10_;

public class Q5_Tea
{
	String name = "Akshara";
	int age = 20;
	

	public static void main(String[] args) 
	{
		Q5_Tea obj = new Q5_Tea();
		obj.addmilk();
		obj.addsugar();
		obj.preparetea();
		
	}
	public void addmilk()
	{
		System.out.println("boiled the milk");	
		}
     public void addsugar()
     {
    	 System.out.println("add the teapowder and sugar");
     }
     public void  preparetea()
     {
    	 System.out.println("after the boiling tea is ready");
     }
     }

