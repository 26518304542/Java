package pck1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(11,12,13,14));
		pane.setHgap(5);
		pane.setVgap(5);
		
		pane.getChildren().addAll(new Label("First name"),new TextField(),new Label("MI"));
		TextField tf = new TextField();
		tf.setPrefColumnCount(2);
		pane.getChildren().addAll(tf,new Label("last name"),new TextField());
		
		Scene scene = new Scene(pane,200,250);
		primaryStage.setTitle("FlowPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[]args) {
		
		Application.launch(args);
	}
}
