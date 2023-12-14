package task10;

public class Tea {
	 String name ="arun";
	    int age =20;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	Tea obj = new Tea();
	System.out.println(obj.name);
	System.out.println(obj.age);
    
	obj.prepareTea();
	obj.addMilk();
	obj.addSugar();;
	}
	public void prepareTea() {
		
		System.out.println("prepare the tea,first we add the hot water");
		System.out.println("second add tea powder");
		
	}
    
	public void addMilk() {
	
	System.out.println("add milk to the tea");
	
	}
	public void addSugar() {
		
		System.out.println("add sugar to the tea");
		 System.out.println("tea is ready");

	}
}