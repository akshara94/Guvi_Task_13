package task9pgm;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	String s1 = "Welcome to Geek";
	
	StringBuilder obj = new StringBuilder(s1);
	System.out.println(obj.reverse());
	


    char a[] = s1.toCharArray();
  
    for(int i=(a.length-1); i>=0; i--) {
    	System.out.print(a[i]);
    }
	}
}
    
