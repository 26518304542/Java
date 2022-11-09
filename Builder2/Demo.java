package Builder2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final ProductClass p1 = new Car().addHeadLights(5).addWheels(4).buildBody("Plastic").contrructCar();
		
		System.out.println(p1);
		
		
	}

}
