package pck1;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application{

	public static void main(String[] args) {

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Text text = new Text(40,40,"Programming is fun");
		Pane pane = new Pane(text);
		
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		Button btLeft = new Button("left");
		Button btRight = new Button("right");
		HBox hbox = new HBox(btUp,btDown,btLeft,btRight);
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane(pane);
		borderPane.setBottom(hbox);
		
		btUp.setOnAction(new EventHandler() {

			@Override
			public void handle(Event e) {
				text.setY(text.getY() > 10?text.getY()-5:10);
			}});
		btDown.setOnAction(new EventHandler() {

			@Override
			public void handle(Event e) {
				text.setY(text.getY() < pane.getHeight()?text.getY() + 5:pane.getHeight());
			}});
		btLeft.setOnAction(new EventHandler() {

			@Override
			public void handle(Event event) {
				text.setX(text.getX() > 0?text.getX()-5:0);
			}});
		btRight.setOnAction(new EventHandler() {

			@Override
			public void handle(Event event) {

				text.setX(text.getX()<pane.getWidth()-100?text.getX()+5:pane.getWidth()-100);
			}});
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Anonymus of text");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
