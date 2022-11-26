package Secondly;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LoginPage extends JFrame implements ActionListener{

	
	private String text;
	
	private String password;
	
	public JTextField textField;
	
	public JTextField passwordField;
	
	public JPanel panel;
	
	public JButton login;
	
	public JButton exit;
	
	public JButton register;
	
	public JLabel passwordLabel;
	
	public JLabel nameLabel;
	
	public boolean log;
	
	public Border raisedBevel,loweredBevel,textfieldline;
	
	public ArrayList<String>  Checking = new ArrayList<>();
	
	FileReader f1 ;
	
	File operatorFile;
	
	BufferedReader br1;
	
	private boolean checkPsw;
	
	
	
	
	public LoginPage() {
		
		raisedBevel = BorderFactory.createRaisedBevelBorder();
		
		loweredBevel = BorderFactory.createLoweredBevelBorder();
		
		textfieldline = BorderFactory.createLineBorder(Color.RED);
		
		
		
		panel = new JPanel();
		
		getContentPane().add(panel);
		
		panel.setLayout(null);
		
		panel.setBounds(0,0,600,600);
		
		panel.setBackground(Color.BLACK);
		
		
		login = new JButton("Login");
		
		login.setBounds(225,500,150,40);
		
		login.setBackground(Color.BLACK);
		
		login.setForeground(Color.RED);
		
		login.setFont(new Font("SERIF",Font.ITALIC,22));
		
		login.setBorder(null);
		
		login.addActionListener(this);
		
		
		exit = new JButton("Exit");
		
		exit.setBounds(300,50,150,40);
		
		exit.setBackground(Color.BLACK);
		
		exit.setForeground(Color.red);
		
		exit.setFont(new Font("SERIF",Font.BOLD,24));
		
		exit.setBorder(raisedBevel);
		
		exit.addActionListener(this);
		
		
		register = new JButton("Register");
		
		register.setBounds(150,50,150,40);
		
		register.setBackground(Color.BLACK);
		
		register.setForeground(Color.RED);
		
		register.setFont(new Font("SERIF",Font.BOLD,24));
		
		register.setBorder(loweredBevel);
		
		register.addActionListener(this);
		
		
		textField = new JTextField();
		
		textField.setBounds(300,400,150,40);
		
		textField.setBorder(textfieldline);
		
		
		passwordField = new JPasswordField();
		
		passwordField.setBounds(300,440,150,40);
		
		passwordField.setBorder(textfieldline);
		
		
		nameLabel = new JLabel("Whole name :");
		
		nameLabel.setBounds(150,400,150,40);
		
		nameLabel.setFont(new Font("SERIF",Font.HANGING_BASELINE,22));
		
		nameLabel.setForeground(Color.WHITE);
		
		nameLabel.setBackground(Color.BLACK);
		
		
		passwordLabel = new JLabel("password :");
		
		passwordLabel.setBounds(150,440,150,40);
		
		passwordLabel.setFont(new Font("SERIF",Font.ITALIC,22));
		
		passwordLabel.setForeground(Color.WHITE);
		
		passwordLabel.setBackground(Color.BLACK);
		
		
		
		panel.add(login);
		
		panel.add(exit);
		
		panel.add(register);
		
		panel.add(textField);
		
		panel.add(passwordField);
		
		panel.add(nameLabel);
		
		panel.add(passwordLabel);
		
		setSize(600,600);
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		
		setVisible(true);
		
		
		
	}
	
	
	
	
	
	public boolean FileReading(String s) throws IOException{
		
		 operatorFile = new File(s);
		
		if(!operatorFile.exists()) {
			
			operatorFile.createNewFile();
		}
	
		
		Checking.clear();
		
		f1 = new FileReader(operatorFile);
		
		 br1 = new BufferedReader(f1);
		
			String line;
			
			while((line = br1.readLine()) != null) {
				
				Checking.add(line);
			}
		
			text = textField.getText() + " " + passwordField.getText();
		
			for(int i=0; i<Checking.size(); i++) {
				
				if(Checking.get(i).equals(text)) {
					
					return true;
				}
			}
			if(s=="operator.txt" && line == null) {
				
				JOptionPane.showMessageDialog(null, "You need to register first");
			}
		br1.close();
		
		return false;
	}
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
			Object o1 = e.getSource();
			
			if(o1==login) {
				
			
					try {
						
						
						checkPsw = FileReading("operator.txt");
						if(log==true) {
						MainPage mainPage = new MainPage();
						dispose();
						}
					}
					catch(IOException e2) {
						
						e2.printStackTrace();
					}
					
					if(checkPsw == true) {
						
						this.log = checkPsw;
					}
					else {
						
						JOptionPane.showMessageDialog(new JFrame(), "Username or Password is wrong!");
					}
			} 
					 
				
			
 
		 else if(o1==exit) {
			 
			 dispose();
			
		 }
			
		 else if(o1==register) {
			 
			 new Registeration();
			 
			 dispose();
		 }	
	}
}
			
			
			
		
		
	


