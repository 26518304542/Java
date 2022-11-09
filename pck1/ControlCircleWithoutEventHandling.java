package pck1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircleWithoutEventHandling extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		StackPane pane = new StackPane();
		Circle circle = new Circle(50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		pane.getChildren().add(circle);
		
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("enlarge");
		Button btShrink = new Button("shrink");
		hbox.getChildren().addAll(btEnlarge,btShrink);
		
		BorderPane border = new BorderPane();
		border.setCenter(pane);
		border.setBottom(hbox);
		BorderPane.setAlignment(hbox, Pos.CENTER);
		
		Scene scene = new Scene(border,200,200);
		primaryStage.setTitle("Show start");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
