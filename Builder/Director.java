package Builder;

public class Director {

	Builder builder;
	
	public void Construct(Builder builder) {
		
		this.builder = builder;
		
		builder.startUpOperations();
		builder.buildBody();
		builder.addHeadLights();
		builder.insertWheels();
		builder.endOperations();
		
	}
}
