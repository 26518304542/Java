package Decorator;

public class Demo {
	
	public static void main(String [] args) {
		
		Fortress c = new Fortress();
		
		c.makeStructure();
		
		FloorDecorator f = new FloorDecorator();
		
		f.setComponent(c);
		
		f.makeStructure();
		
		
	}

}
