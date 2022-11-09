package Builder;

public class Demo {

	public static void main(String[] args) {

		Director director = new Director();
		
		Builder car = new Car("Ford");
		
		Builder motorCycle = new MotorCycle("Honda");
		
		
		director.Construct(car);
		
		Product p1 = car.getVehicle();
		
		p1.showProduct();
		
		
		director.Construct(motorCycle);
	
		Product p2 = motorCycle.getVehicle();
		
		p2.showProduct();
	}

}
