package Prototype;

public class Demo {
	
	public static void main(String [] args) throws CloneNotSupportedException {
		
		BasicCar nano = new Nano("Green Nano");
		
		nano.basePrice = 100000;
		
		BasicCar ford = new Ford("YellowFord");
		
		ford.basePrice = 500000;
		
		BasicCar bc1;
		
		bc1 = nano.clone();
		
		bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
		
		System.out.println( "Car is: "+ bc1.modelName+" and it's price is" +
				"Rs." + bc1.onRoadPrice );
		
		bc1 = ford.clone();
		
		bc1.onRoadPrice = ford.basePrice + BasicCar.setAdditionalPrice();
		
		System.out.println("Car is: "+ bc1.modelName+" and it's price is"
				+"Rs." + bc1.onRoadPrice);
		
		
	}
}
