package pck1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application{

	public static void main(String[] args) {

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane pane = new BorderPane();
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ShowHBoxVBox");
		primaryStage.show();
		
	}

	private Node getVBox() {

		VBox v = new VBox(15);
		v.setPadding(new Insets(15,5,5,5));
		v.getChildren().add(new Label("Courses"));
		
		Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"),new Label("CSCI 2410"), new Label("CSCI 3720")};
		
		for(Label course:courses) {
			v.setMargin(course, new Insets(0,0,0,15));
			v.getChildren().add(course);
		}
		
		return v;
	}

	private Node getHBox() {
			
		HBox h = new HBox(15);
		h.setPadding(new Insets(15,15,15,15));
		h.setStyle("-fx-background-color:gold");
		h.getChildren().add(new Button("Computer Science"));
		h.getChildren().add(new Button("Chemistry"));
		
		
		
		return h;
	}

}
