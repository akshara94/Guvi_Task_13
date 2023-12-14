package guviTask10_;

public class person
{

	String name ;
	int age ;
	
	public static void main(String[] args) 
	{
		person obj1 = new person();
		obj1.display();
		
		person obj2 =new person("kamal");
		obj2.display();
		
		person obj3 = new person(20);
		obj3.display();
	}	
	
	
	public person() //  constructor
	{
		System.out.println("This is a constructor");
		
	}
	public person(String i ) // constructor
	{
		System.out.println("This is a String constructor ");
		name =i;
	}
	public person(int i)// constructor
	{
		System.out.println("This is a int constructor");
		age = i;
	}
	
		public void display() 
		{
			System.out.println("Enter the name :" +name);
			System.out.println("Enter the age :" +age);
		}
}