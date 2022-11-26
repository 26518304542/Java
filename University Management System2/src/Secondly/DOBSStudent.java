package Secondly;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class DOBSStudent extends JFrame implements ActionListener{
	
	public static ArrayList<String>  Checking = new ArrayList<>();

	public JScrollPane sp,sp2 ;
	
	public JPanel panel,panel2,panel3;
	
	public JButton add,delete,update,back;
	
	public static JTextField nameSurname;

	public static JTextField studentNumber;

	public JTextField identity;
	
	public String s1;

	public static String m;

	public static String n;
	
	public static File stuFile;
	
	public FileWriter fw;
	
	public BufferedWriter bw;
	
	public JLabel nameLabel,stuNumLabel,ideLabel;
	
	public BufferedReader br1;

	public FileReader f1;
	
	public JButton lectureDefine;
	
	
	public DOBSStudent() {
		
		
		
		
		
		ideLabel = new JLabel("Identity");
		
		ideLabel.setBackground(Color.BLACK);
		
		ideLabel.setForeground(Color.white);
		
		ideLabel.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));
		
		
		stuNumLabel = new JLabel("Student Number");
		
		stuNumLabel.setBackground(Color.BLACK);
		
		stuNumLabel.setForeground(Color.white);

		stuNumLabel.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));
		
		
		nameLabel = new JLabel("Name&Surname");
		
		nameLabel.setBackground(Color.BLACK);
		
		nameLabel.setForeground(Color.white);
		
		nameLabel.setFont(new Font("SERIF",Font.ROMAN_BASELINE,22));

		
		
		identity = new JTextField();
		
		identity.setBackground(Color.white);
		
		identity.setForeground(Color.red);
		
		identity.setFont(new Font("SERIF",Font.ITALIC,22));
		
		
		
		nameSurname = new JTextField();
		
		nameSurname.setBackground(Color.white);
		
		nameSurname.setForeground(Color.red);
		
		nameSurname.setFont(new Font("SERIF",Font.ITALIC,22));
		
		
		studentNumber = new JTextField();
		
		studentNumber.setBackground(Color.white);
		
		studentNumber.setForeground(Color.red);
		
		studentNumber.setFont(new Font("SERIF",Font.ITALIC,22));
		
		
		
        lectureDefine = new JButton("You can choose a lecture");
		
        lectureDefine.setBounds(150,150,300,100);
		
        lectureDefine.setFont(new Font("SERIF",Font.ITALIC,22));
		
        lectureDefine.setBorder(null);
		
        lectureDefine.setBackground(Color.BLACK);
		
        lectureDefine.setForeground(Color.RED);
		
        lectureDefine.addActionListener(this);
		
		
		
		back = new JButton("BacK");
		
		back.setBounds(400,40,150,100);
		
		back.setFont(new Font("SERIF",Font.ITALIC,22));
		
		back.setBorder(null);
		
		back.setBackground(Color.BLACK);
		
		back.setForeground(Color.RED);
		
		back.addActionListener(this);
		
		
		
		
		add = new JButton("add");
		
		add.setBounds(100,40,150,100);
		
		add.setFont(new Font("SERIF",Font.ITALIC,22));
		
		add.setBorder(null);
		
		add.setBackground(Color.BLACK);
		
		add.setForeground(Color.RED);
		
		add.addActionListener(this);

		
		
		panel3 = new JPanel();
		
		panel3.setLayout(null);
		
		panel3.setBackground(Color.black);
		
		
		
		
		panel2 = new JPanel();
		
		panel2.setLayout(new GridLayout(12,4,100,100));
		
		panel2.setBackground(Color.black);
		
		panel2.add(nameSurname);
		
		panel2.add(nameLabel);
		
		panel2.add(studentNumber);
		
		panel2.add(stuNumLabel);
		
		panel2.add(identity);
		
		panel2.add(ideLabel);
		
		
		panel = new JPanel();
		
		panel.setBounds(0,0,1000,800);
		
		panel.setLayout(new GridLayout(2,1,100,100));
		
		panel.setBackground(Color.BLACK);
		
		panel.add(panel3);
		
		panel3.add(add);
		
		panel3.add(back);
		
		panel3.add(lectureDefine);
		
		
		
		sp2 = new JScrollPane(panel2);
		
		sp2.setBounds(0,0,600,600);
		
		sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		panel.add(sp2);
		
		
		
		setSize(600,600);	
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().add(panel);
		
		setVisible(true);
		
		
		
	}
	
	
	/*public static int getStuNum() {
		
		String num = studentNumber.getText();
		
		int stuNum = Integer.parseInt(num);
		
		return stuNum;
	}
	
	public static String getStuName() {
		
		String stuName = nameSurname.getText();
		
		return stuName;
	}
	*/
	
	
	
	
	
	public void FileWriting() throws IOException {
	
		
		
		stuFile = new File( "DOBSstudent.txt");
		
		 if(!stuFile.exists()) {
			 
			 stuFile.createNewFile();
			 
			 fw = new FileWriter(stuFile);
			 
			  bw = new BufferedWriter(fw);

			  s1 = nameSurname.getText() + " " + studentNumber.getText() +" " + identity.getText();
			
			  bw.write(s1);
	
			  bw.close();
		 }
		 else {
		  fw = new FileWriter(stuFile,true);
		 
		  bw = new BufferedWriter(fw);

		  
		  s1 = nameSurname.getText() + " " + studentNumber.getText() +" " + identity.getText();
		
		  
		Scanner input = new Scanner(stuFile);
		
		
		
		if(!input.hasNextLine()) {
		
			bw.append(s1);
		}
		else {
		  bw.newLine();
		  bw.append(s1);
		}
		  

		  bw.close();
		 }
		 
	
	}
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		
		if(o==add) {
			
			try {
			FileWriting();
			
			JOptionPane.showMessageDialog(new JFrame(), "it is done ");
			
			}catch(IOException a) {
				a.printStackTrace();
				}
		}
		else if(o==back) {
			
			new DepartmentOfBiblicalStudies();
			
			dispose();
		}
		
		else if(o==lectureDefine) {
			
			new Lectures();
			
			dispose();
		}
		
	}

}
