package Builder2;

public interface Builder {

	Builder startUpOperation(String startUpMessage);
	
	Builder buildBody(String bodyType);
	
	Builder addWheels(int noOfWheels);
	
	Builder addHeadLights(int noOfheadLights);
	
	Builder endOperation(String endOperationMessage);
	
	ProductClass contrructCar();
	
	ProductClass getConstructedCar();
}
