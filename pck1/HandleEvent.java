package pck1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox pane = new HBox(10);
		Button butOk = new Button("Ok");
		OkActionEvent ok = new OkActionEvent();
		butOk.setOnAction(ok);
		Button cancel = new Button("Cancel");
		CancelActionEvent cancelEvent = new CancelActionEvent();
		cancel.setOnAction(cancelEvent);
		pane.getChildren().addAll(butOk,cancel);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEvent");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String args[]) {
		
		Application.launch(args);
	}
	
}
class OkActionEvent implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ok");
	}
	
	
}

class CancelActionEvent implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("cancel");
	}
	
	
}