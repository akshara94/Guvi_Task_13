package task10_array;

public class Blacktea7 extends Tea7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tea7 obj = new Blacktea7();//Topcasting
		obj.water();
		obj.milk();
		}
	public void water()//overridden
	{
		System.out.println("boiling the water for blacktea");
	}
	
	}


