package Builder;

public class MotorCycle implements Builder{
	
	private String brandName;
	
	private Product product;
	
	public MotorCycle(String brand) {
		
		product = new Product();
		
		this.brandName = brand;
	}

	@Override
	public void startUpOperations() {

		product.add(String.format("%s", this.brandName));
		
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		product.add("body");
	}

	@Override
	public void insertWheels() {
		// TODO Auto-generated method stub
		product.add("2 Wheels");
	}

	@Override
	public void addHeadLights() {
		// TODO Auto-generated method stub
		product.add("2 headlights");
	}

	@Override
	public void endOperations() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getVehicle() {
		// TODO Auto-generated method stub
		return product;
	}

}
