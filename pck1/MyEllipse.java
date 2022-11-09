package pck1;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class MyEllipse extends Pane {
	
	private void paint() {
		getChildren().clear();
		for(int i=0;i<16;i++) {
			
			Ellipse e1 = new Ellipse(getWidth()/2,getHeight()/2,getWidth()/2-50,getHeight()/2-50);
			e1.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
			e1.setFill(Color.BLACK);
			e1.setRotate(i*180/16);
			getChildren().add(e1);
		}
		
	}
	
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
	
	public void setWidth(double widht) {
		super.setHeight(widht);
		paint();
	}
	
}

