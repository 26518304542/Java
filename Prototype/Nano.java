package Prototype;

public class Nano extends BasicCar{

	public int basePrice = 100000;
	
	public Nano(String m) {
		
		modelName = m;
	}
	
	public BasicCar clone() throws CloneNotSupportedException{
		
		return (Nano)super.clone();
	}
}
