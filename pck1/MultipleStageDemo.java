package pck1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene(new Button("OK"),200,250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("S2");
		primaryStage.show();
		
		Stage stage = new Stage();
		stage.setTitle("new Stage");
		stage.setScene(new Scene(new Button("OK"),200,250));
		stage.show();
	}

	public static void main(String []args) {
		
		Application.launch(args);
		
	}
}

