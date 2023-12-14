package task10_array;

public class Greentea7 extends Tea7 {

	public static void main(String[] args) {
		
		Tea7 obj;
		//int x;
		
		Tea7 a[] = new Tea7[2];//array object
		//int y[] = new int[2];
		
		obj = new Greentea7();
		
		a[0] = new Greentea7();
		a[1] = new Greentea7();
		
		a[0].water();
		a[0].milk();
		}
	public void water()//overriddien
	{
		System.out.println("boiling the water for green tea");
	}

}
