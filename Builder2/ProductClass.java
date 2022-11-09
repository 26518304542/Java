package Builder2;

public final class ProductClass {
	
	private String startUpMessage;
	 private String bodyType;
	 private int noOfWheels;
	 private int noOfHeadLights;
	 private String endOperationsMessage;
	
	public ProductClass(final String startUpMessage, String bodyType,
			int noOfWheels, int noOfHeadLights,
			 String endOperationsMessage) {
		
		 this.startUpMessage = startUpMessage;
		 this.bodyType = bodyType;
		 this.noOfWheels = noOfWheels;
		 this.noOfHeadLights = noOfHeadLights;
		 this.endOperationsMessage = endOperationsMessage;
		
	}
	
	public String toString() {
		
		return startUpMessage + bodyType + endOperationsMessage + noOfHeadLights + noOfWheels;
	}

}
