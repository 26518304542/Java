package Recursion;

public class Test1 {

	public static void main(String args[]) {
		
		System.out.println("Sum is " + xMethod(5));
	}

	private static long xMethod(int n) {
		// TODO Auto-generated method stub
		if(n == 0)
			return 1;
		else 
			return n + xMethod(n-1);
	}
	
	
}
