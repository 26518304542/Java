package Builder;

public class Car implements Builder{

	private String brandName;
	
	private Product product;
	
	public Car(String brand) {
		
		product = new Product();
		
		this.brandName = brand;
	}
	
	@Override
	public void startUpOperations() {

		product.add(String.format("%s", this.brandName));
	}

	@Override
	public void buildBody() {

		product.add("body");
	}

	@Override
	public void insertWheels() {

		product.add("4 wheels");
		
	}

	@Override
	public void addHeadLights() {

		product.add("2 wheels");
		
	}

	@Override
	public void endOperations() {

		
		
	}

	@Override
	public Product getVehicle() {
		// TODO Auto-generated method stub
		return product;
	}
	
	

}
