package pck1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Text text = new Text(20,20,"Programming is Fun");
		pane.getChildren().addAll(text);
		
		text.setOnMouseDragged(e->{
			
			text.setX(e.getX());
			text.setY(e.getY());
		});
		
		Scene scene = new Scene(pane,300,100);
		primaryStage.setTitle("Mouse Event");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
