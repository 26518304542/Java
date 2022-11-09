package pck1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonIPane extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button butOk = new Button("OK");
		Scene scene = new Scene(butOk,200,250);
		primaryStage.setTitle("PS");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String [] args) {
		
		Application.launch(args);
		
	}

}
