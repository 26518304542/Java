package pck1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane pane = new BorderPane();
		pane.setTop(new CustomPane("Top"));
		pane.setBottom(new CustomPane("Bottom"));
		pane.setRight(new CustomPane("Right"));
		pane.setLeft(new CustomPane("Left"));
		pane.setCenter(new CustomPane("Center"));
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Show BorderPane");
		primaryStage.show();
		
	}

	public static void main(String [] args) {
		
		Application.launch(args);
	}
}
