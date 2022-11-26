package Secondly;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class FacultyOfCatholicTheology extends Faculty implements ActionListener{
	
	
	
	
	
	private JButton departmentOfBiblicalStudies,departmentOfCanonAndLawOnReligion,
	
	departmentOfChristianTheology,departmentOfHistoricalTheology,
	
	departmentOfPracticalTheology,depatmentOfReligiousStudies,departmentOfSystematicTheologyAndEthics;
	
	
	
	
	
	
	public FacultyOfCatholicTheology(){
		
		
		
		
	
		panel = new JPanel();
		
		panel.setBackground(Color.BLACK);
		
		panel.setLayout(new GridLayout(12,3,40,30));
		
		
		
		
		
		logOut.setBackground(Color.BLACK);
		
		logOut.setForeground(Color.gray);
		
		logOut.setBorder(null);
		
		logOut.setFont(new Font("SERIF",Font.ITALIC,22));
		
		logOut.addActionListener(this);
		
		
		
		
		back.setBackground(Color.BLACK);
		
		back.setForeground(Color.GRAY);
		
		back.setBorder(null);
		
		back.setFont(new Font("SERIF",Font.ITALIC,22));
		
		back.addActionListener(this);
		
		
		
		
		departmentOfBiblicalStudies = new JButton("Department Of Biblical Studies");
		
		departmentOfBiblicalStudies.setBackground(Color.BLACK);
		
		departmentOfBiblicalStudies.setForeground(Color.blue);
		
		departmentOfBiblicalStudies.setBorder(lineBorder);
		
		departmentOfBiblicalStudies.setFont(new Font("SERIF",Font.ITALIC,22));
		
		departmentOfBiblicalStudies.addActionListener(this);
		
		
		
		departmentOfCanonAndLawOnReligion = new JButton("Department Of Canon And Law On Religion");
		
		departmentOfCanonAndLawOnReligion.setBackground(Color.BLACK);
		
		departmentOfCanonAndLawOnReligion.setForeground(Color.BLUE);
		
		departmentOfCanonAndLawOnReligion.setBorder(lineBorder);
		
		departmentOfCanonAndLawOnReligion.setFont(new Font("ITALIC",Font.ITALIC,22));
		
		departmentOfCanonAndLawOnReligion.addActionListener(this);
		
		
		
		departmentOfChristianTheology = new JButton("Department Of Christian Theology");
		
		departmentOfChristianTheology.setBackground(Color.BLACK);
		
		departmentOfChristianTheology.setForeground(Color.BLUE);
		
		departmentOfChristianTheology.setBorder(lineBorder);
		
		departmentOfChristianTheology.setFont(new Font("SERIF",Font.ITALIC,22));
		
		departmentOfChristianTheology.addActionListener(this);
		
		
		 
		departmentOfHistoricalTheology = new JButton("Department Of Historical Theology");
		
		departmentOfHistoricalTheology.setBackground(Color.BLACK);
		
		departmentOfHistoricalTheology.setForeground(Color.BLUE);
		
		departmentOfHistoricalTheology.setBorder(lineBorder);
		
		departmentOfHistoricalTheology.setFont(new Font("SERIF",Font.ITALIC,22));
		
		departmentOfHistoricalTheology.addActionListener(this);
		
		
		departmentOfPracticalTheology = new JButton("Department Of Practical Theology");
		
		departmentOfPracticalTheology.setBackground(Color.BLACK);
		
		departmentOfPracticalTheology.setForeground(Color.BLUE);
		
		departmentOfPracticalTheology.setBorder(lineBorder);
		
		departmentOfPracticalTheology.setFont(new Font("SERIF",Font.ITALIC,22));
		
		departmentOfPracticalTheology.addActionListener(this);
		
		
		depatmentOfReligiousStudies = new JButton("Depatment Of Religious Studies");
		
		depatmentOfReligiousStudies.setBackground(Color.BLACK);
		
		depatmentOfReligiousStudies.setForeground(Color.blue);
		
		depatmentOfReligiousStudies.setBorder(lineBorder);
		
		depatmentOfReligiousStudies.setFont(new Font("SERIF",Font.ITALIC,22));
		
		depatmentOfReligiousStudies.addActionListener(this);
		
		
		departmentOfSystematicTheologyAndEthics = new JButton("Department Of Systematic Theology And Ethics");
		
		departmentOfSystematicTheologyAndEthics.setBackground(Color.BLACK);
		
		departmentOfSystematicTheologyAndEthics.setForeground(Color.BLUE);
		
		departmentOfSystematicTheologyAndEthics.setBorder(lineBorder);
		
		departmentOfSystematicTheologyAndEthics.setFont(new Font("SERIF",Font.ITALIC,22));
		
		departmentOfSystematicTheologyAndEthics.addActionListener(this);
		
		
		panel.add(departmentOfBiblicalStudies);
		
		panel.add(departmentOfCanonAndLawOnReligion);
		
		panel.add(departmentOfChristianTheology);
		
		panel.add(departmentOfHistoricalTheology);
		
		panel.add(departmentOfPracticalTheology);
		
		panel.add(departmentOfSystematicTheologyAndEthics);
		
		panel.add(depatmentOfReligiousStudies);
		
		panel.add(back);
		
		panel.add(logOut);
		
		
		
		
		
		scrollPane = new JScrollPane(panel);
		
		scrollPane.setBounds(0,0,600,600);
		
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		setSize(600,600);	
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().add(scrollPane);
		
		setVisible(true);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {

		
		Object o = e.getSource();
		
		if(o==departmentOfBiblicalStudies) {
			
			new DepartmentOfBiblicalStudies();
			
			dispose();
			
		}
		else if(o==departmentOfCanonAndLawOnReligion) {
			
			new DepartmentOfCanonAndLawOnReligion();
			
			dispose();
		}
		else if(o==departmentOfChristianTheology) {
			
			new DepartmentOfChristianTheology();
			
			dispose();
		}
		else if(o==departmentOfHistoricalTheology) {
			
			new DepartmentOfHistoricalTheology();
			
			dispose();
		}
		else if(o==departmentOfPracticalTheology) {
			
			new DepartmentOfPracticalTheology();
			
			dispose();
		}
		else if(o==departmentOfSystematicTheologyAndEthics) {
			
			new DepartmentOfSystematicTheologyAndEthics();
			
			dispose();
		}
		else if(o==depatmentOfReligiousStudies) {
			
			new DepatmentOfReligiousStudies();
			
			dispose();
			
		}
		else if(o==back) {
			
			new Faculties();
			
			dispose();
		}
		else if(o==logOut) {
			
			new LoginPage();
			
			dispose();
		}
		
		
	}



	

	





}
