package pck1;

import javafx.application.Application;
import javafx.stage.Stage;

public class Test extends Application{
	
	public Test() {
		
		System.out.println("Test constructor is invoked");
	}

	@Override
	public void start(Stage primaryStage) {

		System.out.println("Test constructor is invoked");
	}
	
	public static void main(String args[]) {
		
		System.out.println("launch application");
		
		Application.launch(args);
	}

}
