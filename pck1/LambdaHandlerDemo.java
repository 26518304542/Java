package pck1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LambdaHandlerDemo extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text(40,40,"Programming is fun");
		Pane pane = new Pane(text);
		
		Button btUp = new Button("up");
		Button btDown = new Button("down");
		Button btLeft = new Button("left");
		Button btright = new Button("right");
		HBox hbox = new HBox(btUp,btDown,btLeft,btright);
		hbox.setSpacing(10);
		
		BorderPane bp = new BorderPane(pane);
		bp.setBottom(hbox);
		
		btUp.setOnAction((ActionEvent e)->{
			text.setY(text.getY()>10?text.getY()-5:10);
		});
		btDown.setOnAction((e)->{
			text.setY(text.getY()<pane.getHeight()?text.getY()+5:pane.getHeight());
		});
		btLeft.setOnAction((e)->{
			text.setX(text.getX()>10?text.getX()-5:10);
		});
		btright.setOnAction((e)->{
			text.setX(text.getX()<pane.getWidth()-100?text.getX()+5:pane.getWidth()-10);
		});
		
		Scene scene = new Scene(bp);
		primaryStage.setTitle("LambdaHandler");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
