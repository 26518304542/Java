package Secondly;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public abstract class Faculty extends JFrame implements ActionListener{
	
	
	
	
	
	public  JPanel panel;
	
	public JScrollPane scrollPane;
	
	private JPanel panelOfStudies;
	
	public JButton logOut = new JButton("Log Out");;
	
	public JButton back = new JButton("Back");
	
	public Border  lineBorder = BorderFactory.createLineBorder(Color.GRAY, 3);
	
	            
	
	
	

}
