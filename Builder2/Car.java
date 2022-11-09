package Builder2;

public class Car implements Builder{

	
	ProductClass product;
	
	private String startUpMessage = "Start";
	
	private String bodyType = "Steel";
	
	private int noOfWheels = 4;
	
	private int noOfheadLights = 2;
	
	private String endOperationMessage = "End";
	
	
	@Override
	public Builder startUpOperation(String startUpMessage) {

		this.startUpMessage = startUpMessage;
		
		return this;
	}

	@Override
	public Builder buildBody(String bodyType) {

		this.bodyType = bodyType;
		
		return this;
	}

	@Override
	public Builder addWheels(int noOfWheels) {
		// TODO Auto-generated method stub
		this.noOfWheels = noOfWheels;
		
		return this;
	}

	@Override
	public Builder addHeadLights(int noOfheadLights) {
		// TODO Auto-generated method stub
		this.noOfheadLights = noOfheadLights;
		
		return this;
	}

	@Override
	public Builder endOperation(String endOperationMessage) {
		// TODO Auto-generated method stub
		this.endOperationMessage = endOperationMessage;
		
		return this;
	}

	@Override
	public ProductClass contrructCar() {

		product = new ProductClass(this.startUpMessage,this.bodyType,this.noOfWheels,this.noOfheadLights,this.endOperationMessage);
		
		return product;
	}

	@Override
	public ProductClass getConstructedCar() {

		return product;
	}

}
