package Prototype;

public class Ford extends BasicCar{

	public int basePrice = 100000;
	
	public Ford(String m) {
		
		modelName = m;
	}
	
	public BasicCar clone() throws CloneNotSupportedException{
		
		return (Ford)super.clone();
	}
}
