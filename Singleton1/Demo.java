package Singleton1;

public class Demo {
	
	public static void main(String [] args) {
		
		Captain c1 = Captain.getCaptain();
		
		Captain c2 = Captain.getCaptain();
		
		if(c1==c2) {
			
			System.out.println("captain1 and captain2 are same instance.");

		}
		
	}

}
