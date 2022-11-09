package Decorator;

public class FloorDecorator extends AbstractDecorator{

	
	public void makeStructure() {
		
		super.makeStructure();
		
		addFloor();
	}
	
	
	public void addFloor() {
		// TODO Auto-generated method stub
		System.out.println("Water");
	}
	
	

}
