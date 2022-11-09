package Builder;

import java.util.LinkedList;

public class Product {

	public LinkedList <String> parts;
	
	public Product() {
		
	parts	= new LinkedList<String>();
		
	}
	
	public void add(String m) {
		
		parts.addLast(m);
		
	}
	
	public void showProduct() {
		
		System.out.println("\nProduct completed as below :");
		for(String part:parts) {
			
			System.out.println(part);
		}
	}
}
