package pck1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowLine extends Application{

	public static void main(String[] args) {

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(new LinePane(),200,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("sholine");
		primaryStage.show();
		
	}

}
