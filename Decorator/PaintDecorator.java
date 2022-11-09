package Decorator;

public class PaintDecorator extends AbstractDecorator{

	
	public  void makeStructure(){
		
		super.makeStructure();
		
		Paint();
		
	}
	
	public void Paint() {

		System.out.println("Content");
	}

	
}
