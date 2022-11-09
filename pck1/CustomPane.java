package pck1;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class CustomPane extends StackPane {

	public CustomPane(String Title) {
		
		getChildren().add(new Label(Title));
		setStyle("-fx-border-color:red");
		setPadding(new Insets(11.5,12.5,13.5,14.5));
		
	}

}
