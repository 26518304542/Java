package pck1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage){
		// TODO Auto-generated method stub
		
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane,200,200);
		primaryStage.setTitle("cicle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
