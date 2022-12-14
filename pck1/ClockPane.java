package pck1;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends Pane{
	
	private int hour;
	private int minute;
	private int seconds;
	
	public ClockPane() {
		setCurrentTime();
	}

	public void ClockPane(int hour,int minute,int seconds) {
		
		this.hour=hour;
		this.minute=minute;
		this.seconds=seconds;
		
	}
	
	public void setCurrentTime() {
		// TODO Auto-generated method stub
		
		Calendar calendar = new GregorianCalendar();
		
		this.hour=calendar.get(Calendar.HOUR_OF_DAY);
		this.minute=calendar.get(Calendar.MINUTE);
		this.minute=calendar.get(Calendar.SECOND);
		
		paintClock();
		
	}
	
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
		
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
		paintClock();
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}

	public void paintClock() {

		double clockRadius = Math.min(getWidth(), getHeight())*0.8*0.5;
		double centerX = getWidth()/2;
		double centerY = getHeight()/2;
		
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX -clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
		
		double sLength = clockRadius*0.8;
		double secondX = centerX+ sLength*Math.sin(seconds*(2*Math.PI/60));
		double secondY = centerY - sLength*Math.cos(seconds*(2*Math.PI/60));
		Line sLine = new Line(centerX,centerX,secondX,secondY);
		sLine.setStroke(Color.RED);
		
		double mLength = clockRadius*0.65;
		double Xminute = centerX + mLength*Math.sin(minute*(2*Math.PI/60));
		double Yminute = centerY - mLength*Math.cos(minute*(2*Math.PI/60));
		Line mLine = new Line(centerX,centerY,Xminute,Yminute);
		mLine.setStroke(Color.BLUE);
		
		double hLength = clockRadius*0.5;
		double hourX = centerX + hLength*Math.sin(hour*(2*Math.PI/60));
		double hourY = centerY - hLength*Math.cos(hour*(2*Math.PI/60));
		Line hLine = new Line(centerX,centerY,hourX,hourY);
		hLine.setStroke(Color.GREEN);
		
		getChildren().clear();
		getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
		
	}
	
	public void setWidth(double width) {
		super.setWidth(width);
		paintClock();
	}
	
	public void setHeight(double height) {
		super.setHeight(height);
		paintClock();
	}

	public int getHour() {
		// TODO Auto-generated method stub
		return hour;
	}

	public int getMinute() {
		// TODO Auto-generated method stub
		return minute;
	}

	public int getSecond() {
		// TODO Auto-generated method stub
		return seconds;
	}

	
	
}










