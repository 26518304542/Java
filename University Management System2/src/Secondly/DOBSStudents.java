package Secondly;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;

public class DOBSStudents extends JFrame implements Lists{

	
	
	
	
	
	public String nameSurname;
	
	public JPanel panel;
	
	public Border lineBorder,lineBorder2;
	
	public static JList<String> studentList;
	
	public JTextArea listChoice;
	
	public JScrollPane jsp,jsp2 ;
	
	private static ArrayList<String> students = new ArrayList<>();

	private static BufferedReader br;

	private static FileReader f1;
	
	public static DefaultListModel<String> model = new DefaultListModel<String>();
	
	public static ArrayList <String> al;
	
	 PrintWriter pw;
	
	
	
	
	public DOBSStudents() {
		
		
		
		
		
			
		lineBorder = BorderFactory.createLineBorder(Color.red,3);
		
		lineBorder2 = BorderFactory.createLineBorder(Color.BLUE,3);
		
		
		
		listChoice = new JTextArea();
		
		listChoice.setBackground(Color.BLACK);
		
		listChoice.setForeground(Color.WHITE);
		
		listChoice.setFont(new Font("SERIF",Font.ITALIC,22));
		
		listChoice.setBorder(lineBorder2);
		
		
		jsp2 = new JScrollPane(listChoice);
		
		jsp2.setBounds(50,420,500,200);
		
		jsp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		
		studentList = new JList<>();
		
		studentList.setBackground(Color.BLACK);
		
		studentList.setForeground(Color.WHITE);
		
		studentList.setFont(new Font("SERIF",Font.ITALIC,22));
		
		studentList.setBorder(lineBorder);
		
		
		jsp = new JScrollPane(studentList);
		
		jsp.setBounds(50,10,500,290);
		
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		add.setBounds(100,300,200,40);
		
		add.setBackground(Color.BLACK);
		
		add.setForeground(Color.RED);
		
		add.setBorder(lineBorder);
		
		add.setFont(new Font("SERIF",Font.ITALIC,22));
		
		add.addActionListener(this);
		
		
		
		showInfo.setBounds(100,350,200,40);
		
		showInfo.setBackground(Color.BLACK);
		
		showInfo.setForeground(Color.RED);
		
		showInfo.setBorder(lineBorder);
		
		showInfo.setFont(new Font("SERIF",Font.ITALIC,22));
		
		showInfo.addActionListener(this);
		
		
	
		delete.setBounds(300,300,100,40);
		
		delete.setBackground(Color.BLACK);
		
		delete.setForeground(Color.RED);
		
		delete.setBorder(lineBorder);
		
		delete.setFont(new Font("SERIF",Font.ITALIC,22));
		
		delete.addActionListener(this);
		
		
		update.setBounds(300,340,100,40);
		
		update.setBackground(Color.BLACK);
		
		update.setForeground(Color.RED);
		
		update.setBorder(lineBorder);
		
		update.setFont(new Font("SERIF",Font.ITALIC,22));
		
		update.addActionListener(this);
		
		
		
		back.setBounds(300,380,100,40);
		
		back.setBackground(Color.BLACK);
		
		back.setForeground(Color.RED);
		
		back.setBorder(lineBorder);
		
		back.setFont(new Font("SERIF",Font.ITALIC,22));
		
		
	
		
		
		
		
		panel = new JPanel();
		
		panel.setLayout(null);
		
		panel.setBounds(0,0,600,600);
		
		panel.setBackground(Color.BLACK);
		
		panel.add(add);
		
		panel.add(delete);
		
		panel.add(update);
		
		panel.add(back);
		
		panel.add(jsp);
		
		panel.add(jsp2);
		
		panel.add(showInfo);
		
		
		
		
		setSize(600,600);
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		
		getContentPane().add(panel);
		
		setVisible(true);
	}
	
	

	public void addOperation() throws IOException {
		
	
		String s = listChoice.getText();
		
		model.addElement(s);
		
		studentList.setModel(model);
		
		File file = new File("DOBSStudent.txt");
		
		FileWriter fw = new FileWriter(file);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		  ListModel<String> dlm = new  DefaultListModel<String>();
	   	    
	   	    dlm =  studentList.getModel();
	   	    
	   	    for(int i = 0;i < dlm.getSize();i++) {
	   	    	
	   	    	String c = dlm.getElementAt(i);
	   	    	
	   	    	bw.append(c);
	   	    	
	   	    	bw.newLine();
	   	    }
	   	  
	   	    bw.close();
		
		
	}
	
	
	
	public static void FileReading(String s) throws IOException{
		
		model.clear();
		
		File studentsFile = new File(s);
		
		if(!studentsFile.exists()) {
			
			studentsFile.createNewFile();
		}
	
		
		f1 = new FileReader(studentsFile);
		
		br = new BufferedReader(f1);
		
	
		 
		String line;
		
		   
		al = new ArrayList<String>();
		
		
		while ((line = br.readLine()) != null) {
			
		
			al.add(line);
		   
			
		}
		
		
		for(int i = 0;i<al.size();i++) {
		
			
			model.addElement(al.get(i));
		}
		
		     
        	
		
		studentList.setModel(model);
		
		
		f1.close();
		
	
		
	}
	
	public void deleteOperation() {
		
		ListSelectionModel selmodel = studentList.getSelectionModel();
        int index = selmodel.getMinSelectionIndex();
        if (index >= 0) {
          model.remove(index);
          
          try {
  			
   	       File stuFile = new File("DOBSStudent.txt");
   	       
   	       if(!stuFile.exists()) {
   	    	   
   	    	   try {
   				stuFile.createNewFile();
   			} catch (IOException e1) {
   				// TODO Auto-generated catch block
   				e1.printStackTrace();
   			}
   	       }
   	    
   	    FileWriter fw = new FileWriter(stuFile);
   	    
   	    BufferedWriter bw = new BufferedWriter(fw);
   	       
   	   ListModel<String> dlm = new  DefaultListModel<String>();
   	    
   	    dlm =  studentList.getModel();
   	    
   	    for(int i = 0;i < dlm.getSize();i++) {
   	    	
   	    	String c = dlm.getElementAt(i);
   	    	
   	    	bw.append(c);
   	    	
   	    	bw.newLine();
   	    }
   	  
   	    bw.close();
   	    
   		}
   		catch(IOException a) {
   			a.printStackTrace();
   			
   		}
        
      }
        else if(index < 0)
        	JOptionPane.showMessageDialog(null,"this list is empty");
	
		
	}
	
	
	public void updateOperation(String a) throws IOException {
		
		
		String s = listChoice.getText();

		
				
		ListSelectionModel selmodel = studentList.getSelectionModel();
        int index = selmodel.getMinSelectionIndex();
        if (index >= 0) {
          model.setElementAt(s,index);}
		
        studentList.setModel(model);
        
        File file = new File(a);
        
        if(!file.exists()) {
        	
        	file.createNewFile();
        }
        
        
        FileWriter fw = new FileWriter(file);
   	    
   	    BufferedWriter bw = new BufferedWriter(fw);
   	       
   	   ListModel<String> dlm = new  DefaultListModel<String>();
   	    
   	    dlm =  studentList.getModel();
   	    
   	    for(int i = 0;i < dlm.getSize();i++) {
   	    	
   	    	String c = dlm.getElementAt(i);
   	    	
   	    	bw.append(c);
   	    	
   	    	bw.newLine();
   	    }
   	  
   	    bw.close();
   	    
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		
		if(o==showInfo) {
			
			try {
				FileReading("DOBSstudent.txt");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		
		else if(o==add) {
			
			try {
				addOperation();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if((o==delete)) {
	
			
		deleteOperation();
	
		}
		
		else if(o==update) {
			
		
		try {
			updateOperation("DOBSStudent.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		                  }	
			
		}
		
		
		
		
		
		}
		
		
	}


