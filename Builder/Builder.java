package Builder;

public interface Builder {
	
	public void startUpOperations();
	
	public void buildBody();
	
	public void insertWheels();
	
	public void addHeadLights();
	
	public void endOperations();
	
	public Product getVehicle();

}
