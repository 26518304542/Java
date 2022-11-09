package pck1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayClock extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		ClockPane clock = new ClockPane();
		String timeString = clock.getHour() + ":" + clock.getMinute()
		 + ":" + clock.getSecond();
		Label currentTime = new Label(timeString);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(currentTime);
		pane.setAlignment(currentTime, Pos.CENTER);
		
		Scene scene = new Scene(pane,250,250);
		primaryStage.setTitle("show clock");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
