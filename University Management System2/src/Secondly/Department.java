package Secondly;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public interface Department extends ActionListener{
	
	
	String [] b = {"add","Go to list"};
	
	public  JComboBox  <String> studentCombo  = new JComboBox(b);
	
	public  JComboBox  <String> LecturerCombo = new JComboBox(b); 
	
	public  JComboBox  <String> LectureCombo = new JComboBox(b); 
	
	public JList <String> studiesList = new JList<>();
	
	public JButton a1 = new JButton("student");
	
	public JButton a2 = new JButton("Lecturer");
	
	public JButton a3 = new JButton("lecture");
	
	public JButton a4 = new JButton("back");
	
	
	

	

}
