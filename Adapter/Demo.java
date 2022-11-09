package Adapter;

public class Demo {
	
	public static void main(String [] args) {
		
		Adapter a = new Adapter();
		
		Triangle t = new Triangle(10,20);
		
		System.out.println(a.getArea(t));
	}

}
