package Secondly;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainPage implements ActionListener{
	
	
	public JFrame mainPage;
	
	public JPanel mainPanel;
	
	public JButton logOut;
	
	public JButton settings;
	
	public JButton useAnotherAccount;
	
	public JButton campusMap;
	
	public JButton laboratory;
	
	public JButton library;
	
	public JButton museum;
	
	public JButton organization;
	
	public JButton studies;
	
	public JButton faculties;
	
	public JButton classes;
	
	
	
	public  MainPage() {
		
		mainPage = new JFrame();	
		
		mainPage.setLayout(null);
		
		mainPage.setSize(600,650);
		
		mainPage.setResizable(false);
		
		mainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelBuilder();
		
		mainPage.add(mainPanel);
		
		mainPage.setVisible(true);
		
		mainPage.setLocationRelativeTo(null);
	
	}
	

	public void panelBuilder() {

		mainPanel = new JPanel();
		
		mainPanel.setBackground(Color.BLACK);
		
		mainPanel.setLayout(null);
		
		mainPanel.setBounds(0,0,600,650);
		
		buttonBuilder();
		
		mainPanel.add(logOut);
		
		mainPanel.add(settings);
		
		mainPanel.add(useAnotherAccount);
		
		mainPanel.add(campusMap);
		
		mainPanel.add(laboratory);
		
		mainPanel.add(library);
		
		mainPanel.add(museum);
	
		mainPanel.add(organization);
		
		mainPanel.add(studies);
		
		mainPanel.add(faculties);
		
		mainPanel.add(classes);
	}

	

	
	
	public void buttonBuilder() {

		logOut = new JButton("Log Out");
		
		logOut.setBounds(250,540,100,40);
		
		logOut.setBackground(Color.BLACK);
		
		logOut.setForeground(Color.YELLOW);
		
		logOut.setFont(new Font("SERIF",Font.ITALIC,14));
		
		logOut.setBorder(null);
		
		
		settings = new JButton("Settings");
		
		settings.setBounds(150,500,150,40);
		
		settings.setBackground(Color.BLACK);
		
		settings.setForeground(Color.RED);
		
		settings.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));
		
		
		useAnotherAccount = new JButton("Another Account");
		
		useAnotherAccount.setBounds(300,500,200,40);
		
		useAnotherAccount.setBackground(Color.BLACK);
		
		useAnotherAccount.setForeground(Color.RED);
		
		useAnotherAccount.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));
		
		
		campusMap = new JButton("Campus Map");
		
		campusMap.setBounds(450,300,150,40);
		
		campusMap.setBackground(Color.BLACK);
		
		campusMap.setForeground(Color.WHITE);
		
		campusMap.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));
		
		campusMap.setBorder(null);
		
		
		laboratory = new JButton("Laboratory");
		
		laboratory.setBounds(300,300,150,40);
		
		laboratory.setBackground(Color.BLACK);
		
		laboratory.setForeground(Color.WHITE);
		
		laboratory.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));
		
		laboratory.setBorder(null);
		
		
		library = new JButton("Library");
		
		library.setBounds(150,300,150,40);
		
		library.setBackground(Color.BLACK);
		
		library.setForeground(Color.WHITE);
		
		library.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));
		
		library.setBorder(null);
		
		
		museum = new JButton("Museum");
		
		museum.setBounds(0,300,150,40);
		
		museum.setBackground(Color.BLACK);
		
		museum.setForeground(Color.WHITE);
		
		museum.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));
		
		museum.setBorder(null);
		
		
		
		organization = new JButton("Organization");
		
		organization.setBounds(450,150,150,40);
		
		organization.setBackground(Color.BLACK);
		
		organization.setForeground(Color.RED);
		
		organization.setFont(new Font("SERIF",Font.ITALIC,22));
		
		organization.setBorder(null);
		
		
		
		studies = new JButton("Studies");
		
		studies.setBounds(300,150,150,40);
		
		studies.setBackground(Color.BLACK);
		
		studies.setForeground(Color.RED);
		
		studies.setFont(new Font("SERIF",Font.ITALIC,22));
		
		studies.setBorder(null);
		
		
	
		faculties = new JButton("Faculties");
		
		faculties.setBounds(150,150,150,40);
		
		faculties.setBackground(Color.BLACK);
		
		faculties.setForeground(Color.RED);
		
		faculties.setFont(new Font("SERIF",Font.ITALIC,22));
		
		faculties.setBorder(null);
		
		faculties.addActionListener(this);
		
		
		
		
		classes = new JButton("Classes");
		
		classes.setBounds(0,150,150,40);
		
		classes.setBackground(Color.BLACK);
		
		classes.setForeground(Color.RED);
		
		classes.setFont(new Font("SERIF",Font.ITALIC,22));
		
		classes.setBorder(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object o1 = e.getSource();
		
		if(o1==logOut) {
			
			LoginPage login = new LoginPage();
			
			mainPage.dispose();
			
		}
		else if(o1==faculties) {
			
			new Faculties();
			
			mainPage.dispose();
		}
		
		
	}
	
	

}
