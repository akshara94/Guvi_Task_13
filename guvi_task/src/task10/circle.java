package task10;

import java.util.Scanner;

public class circle {
	double PI = 3.14159;
	double radius;
	
	
	public circle()
	{
		radius = 0.0;
	}
	public circle(double r )
	{
		radius =r;
	}
	public void setRadius(double r)
	{
		radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getcircumference()
	{
		return 2 * PI * radius;
	}
	
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 Scanner s1 = new Scanner(System.in);
		 
		 System.out.print("Enter the radius of a circle :");
		 double radius = s1.nextDouble();
		 
		 circle c1 = new circle(radius);
		 
		 System.out.println("circumference is " +c1.getcircumference());
	
	s1.close();
	}

}
