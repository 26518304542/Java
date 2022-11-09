package pck1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5,5,5,5));
		Image image = new Image("In/b1.gif");
		pane.getChildren().add(new ImageView(image));
		
		ImageView image2 = new ImageView(image);
		image2.setFitHeight(100);
		image2.setFitWidth(100);
		pane.getChildren().add(image2);
		
		ImageView image3 = new ImageView(image);
		image3.setRotate(90);
		pane.getChildren().add(image3);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Image");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
