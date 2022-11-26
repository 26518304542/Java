package Secondly;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DepartmentOfBiblicalStudies extends JFrame implements Department{

	
	
	
	
	
	private JPanel depPanel;
	
	private JScrollPane depSp;
	
	public BufferedReader br;
	
	public FileReader f1;
	

	
	public DepartmentOfBiblicalStudies() {
	
		
		
		
		studentCombo.setBackground(Color.BLACK);
		
		studentCombo.setForeground(Color.red);
		
		studentCombo.setFont(new Font("SERIF",Font.ITALIC,22));
		
		
		LecturerCombo.setBackground(Color.BLACK);
		
		LecturerCombo.setForeground(Color.red);
		
		LecturerCombo.setFont(new Font("SERIF",Font.ITALIC,22));
		
		
		LectureCombo.setBackground(Color.BLACK);
		
		LectureCombo.setForeground(Color.red);
		
		LectureCombo.setFont(new Font("SERIF",Font.ITALIC,22));
		
		
		
	
		a1.setBackground(Color.BLACK);
		
		a1.setForeground(Color.RED);
		
		a1.setFont(new Font("SERIF",Font.ITALIC,22));
		
		a1.addActionListener(this);
	
		
		a2.setBackground(Color.BLACK);
		
		a2.setForeground(Color.RED);
		
		a2.setFont(new Font("SERIF",Font.ITALIC,22));
		
		a2.addActionListener(this);
		
		
		a3.setBackground(Color.BLACK);
		
		a3.setForeground(Color.RED);
		
		a3.setFont(new Font("SERIF",Font.ITALIC,22));
		
		a3.addActionListener(this);
		
		
		a4.setBackground(Color.BLACK);
		
		a4.setForeground(Color.white);
		
		a4.setFont(new Font("SERIF",Font.ITALIC,22));
		
		a4.addActionListener(this);
		
	
		
		
        depPanel = new JPanel();
		
		depPanel.setBackground(Color.BLACK);
		
		depPanel.setLayout(new GridLayout(20,3,100,40));
		
		depPanel.add(studentCombo);
		
		depPanel.add(a1);
		
		
		depPanel.add(LecturerCombo);
		
		depPanel.add(a2);
		
		
		depPanel.add(LectureCombo);
		
		depPanel.add(a3);
		
		
		depPanel.add(a4);
		
		
		
		depSp = new JScrollPane(depPanel);
		
		depSp.setBounds(0,0,600,600);
		
		depSp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		
		
		
		setSize(600,600);	
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().add(depSp);
		
		setVisible(true);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public static String getText(String s) {
		
		return s;
	}
		
		
		
		
	public String getText() {
		
		return "Department of Biblical Studies";
	}
		
	

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		
		if(o==a1&&studentCombo.getSelectedItem()=="add") {
			
			
		new DOBSStudent();
		
		
		dispose();
			
		}
		
		if(o==a1&&studentCombo.getSelectedItem()=="Go to list") {
			
			
			new DOBSStudents();
			
			dispose();
				
			}
		
		
		else if(o==a2&&LecturerCombo.getSelectedItem()=="add") {
			
			new Lecturer();
		
			dispose();
			
		}
		else if(o==a2&&LecturerCombo.getSelectedItem()=="Go to list") {
			
			new Lecturers();
			
			dispose();
		}
		
		
		else if(o==a3&&LectureCombo.getSelectedItem()=="add") {
			
			new Lecture();
		
			dispose();
		}
		else if(o==a3&&LectureCombo.getSelectedItem()=="Go to list") {
			
			new Lectures();
			
			dispose();
			}
	
		else if(o==a4) {
			
			new Faculties();
		}
		
	}

	
	
}
