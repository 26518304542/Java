package pck1;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class ControlCircle extends Application{

	private CirclePane circlePane = new CirclePane();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(10);
		Button Enlarge = new Button("Enlarge");
		Button Shrink = new Button("Shrink");
		hbox.getChildren().add(Enlarge);
		hbox.getChildren().add(Shrink);
		
		Enlarge.setOnAction(new EnlargeHandler());
		
		BorderPane pane = new BorderPane();
		pane.setCenter(circlePane);
		pane.setBottom(hbox);
		BorderPane.setAlignment(hbox, Pos.CENTER);
		
		Scene scene = new Scene(pane,200,150);
		primaryStage.setTitle("Control Circle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	class EnlargeHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			circlePane.Enlarge();
		}
		
		
	}

}




class CirclePane extends Pane{

	private Circle circle = new Circle(10);
	
	public CirclePane() {
		
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}
	
	public void Enlarge() {
		
		circle.setRadius(circle.getRadius() + 2);
		
	}
	
	public void Shrink() {
		
		circle.setRadius(circle.getRadius()>2 ? circle.getRadius()-2:circle.getRadius());
	}
	
}


