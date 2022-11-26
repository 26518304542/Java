package Secondly;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Registeration extends JFrame implements ActionListener {

	private JButton register;
	
	private JButton Exit;
	
	private JButton back;
	
	private JTextField password;
	
	private JTextField name;
	
	private JLabel nameLabel;
	
	private JLabel passwordLabel;
	
	private JPanel panel;
	
	private Border lineBorder,loweredBevelBorder,raisedBevelBorder;
	
	private File operatorFile;
	
	FileWriter fw;
	
	BufferedWriter br;
	
	String Info;
	
	
	
	public Registeration() {
		
		
		lineBorder = BorderFactory.createLineBorder(Color.RED);
		
		loweredBevelBorder = BorderFactory.createLoweredBevelBorder();
		
		raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
		
		
		panel = new JPanel();
		
		panel.setBounds(0,0,600,600);
		
		panel.setLayout(null);
		
		getContentPane().add(panel);
		
		panel.setBackground(Color.BLACK);
		
		
		passwordLabel = new JLabel("password :");
		
		passwordLabel.setBounds(150,500,150,40);
		
		passwordLabel.setFont(new Font("SERIF",Font.ITALIC,22));
		
		passwordLabel.setBackground(Color.BLACK);
		
		passwordLabel.setForeground(Color.WHITE);
		
		
		nameLabel = new JLabel("name:");
		
		nameLabel.setBounds(150,460,150,40);
		
		nameLabel.setFont(new Font("SERIF",Font.ITALIC,22));
		
		nameLabel.setForeground(Color.WHITE);
		
		
		password = new JTextField();
		
		password.setBounds(300,500,150,40);
		
		password.setFont(new Font("ITALIC",Font.ITALIC,22));
		
		password.setBorder(loweredBevelBorder);
		
		
		name = new JTextField();
		
		name.setBounds(300,460,150,40);
		
		name.setFont(new Font("ITALIC",Font.ROMAN_BASELINE,22));
		
		name.setBorder(raisedBevelBorder);
		
		
		
		register = new JButton("Register");
		
		register.setBounds(225,360,150,40);
		
		register.setBackground(Color.BLACK);
		
		register.setForeground(Color.RED);
		
		register.setBorder(lineBorder);
		
		register.setFont(new Font("SERIF",Font.ITALIC,23));
		
		register.addActionListener(this);
		
		
	
		
		back = new JButton("Back");
		
		back.setBounds(0,0,300,40);
		
		back.setBackground(Color.WHITE);
		
		back.setForeground(Color.BLACK);
		
		back.setBorder(lineBorder);
		
		back.setFont(new Font("SERIF",Font.ITALIC,22));
		
		back.addActionListener(this);
		
		
		Exit = new JButton("Exit");
		
		Exit.setBounds(300,0,300,40);
		
		Exit.setBackground(Color.BLACK);
		
		Exit.setForeground(Color.WHITE);
		
		Exit.setBorder(lineBorder);
		
		Exit.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));
		
		Exit.addActionListener(this);
		
		
		
		panel.add(passwordLabel);
		
		panel.add(nameLabel);
		
		panel.add(Exit);
		
		panel.add(back);
		
		panel.add(register);
		
		panel.add(name);
		
		panel.add(password);
		
		setSize(600,600);
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		
		setVisible(true);
		
		
	}
	
	public void FileWriting() throws IOException {
		
		 operatorFile = new File("operator.txt");
		
		 if(!operatorFile.exists()) {
			 
			 operatorFile.createNewFile();
		 }
		 
		  fw = new FileWriter(operatorFile);
		 
		  br = new BufferedWriter(fw);
		
		  Info = name.getText() + " " + password.getText();
		  
		  br.write(Info);
		  
		  br.newLine();
		  
		  br.close();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		
		if(o==Exit) {
			
			dispose();
			
		}
		else if(o==back) {
			
			new LoginPage();
			
			dispose();
			
		}
		else if(o==register) {
			
			try {
				
				FileWriting();
				
			} 
			catch (IOException e2) {

				e2.printStackTrace();
			}
		}
		
		
	}
	
	

}
