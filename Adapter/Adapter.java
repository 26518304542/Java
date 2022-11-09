package Adapter;

public class Adapter {
	
	
	
	public  double getArea(Triangle t) {
		
		Rectangle r = new Rectangle();
		
		Calculator c = new Calculator();
		
		r.length = t.base;
		
		r.width = 0.5*t.height;
		
		return c.getArea(r);
	}
	
	

}
