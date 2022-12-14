package pck1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
		
		pane.add(new Label("First Name"), 0, 0);
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("MI"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name"), 0, 2);
		pane.add(new TextField(),1, 2);
		Button butAdd = new Button("Add Name");
		pane.add(butAdd, 1, 3);
		GridPane.setHalignment(butAdd, HPos.RIGHT);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ShowGridPane");
		primaryStage.show();
	}

}
