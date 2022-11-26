package Secondly;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import javafx.scene.control.ScrollBar;

public class Faculties extends JFrame implements ActionListener{

	ArrayList<JButton> buttons = new ArrayList<>();
	
public ArrayList <JButton> faculties = new ArrayList<>(); 

	private JScrollPane sbVertical;
	
	public JPanel panel = new JPanel();
	
	public JButton facultyOfCatholicTheology = new JButton("Faculty Of Catholic Theology");
	
	public JButton FacultyOfProtestanTheology = new JButton("Faculty Of Protestan Theology");
	
	public JButton FacultyOfLaw = new JButton("Faculty Of Law");
	
	public JButton FacultyOfBusienessEconomicsAndStatistics = new JButton("Faculty Of Busieness Economics And Statistics");
	
	public JButton FacultyOfCoumputerScience = new JButton("Faculty Of CoumputerScience");
	
	public JButton FacultyOfHistoryAndCulturelStudies = new JButton("Faculty Of History And Culturel Studies");
	
	public JButton FacultyOfPhilologicalCulturelStudies = new JButton("Faculty Of Philological Culturel Studies");
	
	public JButton FacultyOfPsychology = new JButton("Faculty Of Psychology");
	
	public JButton FacultyOfSocialSciences = new JButton("Faculty Of Social Sciences");
	
	public JButton FacultyOfMathematics = new JButton("Faculty Of Mathematics");
	
	public JButton FacultyOfPhysics = new JButton("Faculty Of Physics");
	
	public JButton FacultyOfChemistry = new JButton("Faculty Of Chemistry");
	
	public JButton FacultyOfEarthSciencesGeographyAndAstronomy = new JButton("Faculty Of EarthSciences,Geography And Astronomy");
	
	public JButton FacultyOfLifeSciences = new JButton("Faculty Of Life Sciences");
	
	public JButton CentreForTranslationalStudies = new JButton("Centre For Translational Studies");
	
	public JButton CentreForSportSciencesandUniversitySport= new JButton("Centre For Sport Sciences and UniversitySport");
	
	public JButton CentreForMoleculerBiology = new JButton("Centre For Moleculer Biology");
	
	public JButton CentreForMicroBiologyAndEnvironmentalScience = new JButton("Centre For MicroBiology And Environmental Science");
	
	public JButton CentreForTeacherEducation = new JButton("Centre For Teacher Education");
	
	public Border raisedBevelBorder,lineBorder;
	
	public JButton logOut = new JButton("Log Out");
	
	public JButton back = new JButton("back");
	
	public Faculties() {
		
		super("JScrollPane Demonstration");
	
		
		
		
		
		lineBorder = BorderFactory.createLineBorder(Color.RED, 4);
		
		raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
		
		sbVertical = new JScrollPane(panel);
		
		sbVertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		sbVertical.setVisible(true);
		
	
		
		
		panel.setBounds(0,0,600,600);
		
		panel.setBackground(Color.BLACK);
		
		panel.setLayout(new GridLayout(21,2,2,40));
		
		getContentPane().add(sbVertical);
		
		panel.setBorder(raisedBevelBorder);
		
		
		
		
		
		facultyOfCatholicTheology.setBackground(Color.BLACK);
		
		facultyOfCatholicTheology.setForeground(Color.WHITE);
		
		facultyOfCatholicTheology.setFont(new Font("SERIF",Font.ITALIC,22));
		
		facultyOfCatholicTheology.setBorder(raisedBevelBorder);
		
		facultyOfCatholicTheology.addActionListener(this);
		
		
		
		
		FacultyOfProtestanTheology.setBackground(Color.BLACK);
		
		FacultyOfProtestanTheology.setForeground(Color.WHITE);
		
		FacultyOfProtestanTheology.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfProtestanTheology.setBorder(null);
		
		FacultyOfProtestanTheology.addActionListener(this);
		
		
		
		
		FacultyOfLaw.setBackground(Color.BLACK);
		
		FacultyOfLaw.setForeground(Color.WHITE);
		
		FacultyOfLaw.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfLaw.setBorder(raisedBevelBorder);
		
		FacultyOfLaw.addActionListener(this);
		
		
		
		
		FacultyOfBusienessEconomicsAndStatistics.setBackground(Color.BLACK);
		
		FacultyOfBusienessEconomicsAndStatistics.setForeground(Color.WHITE);
		
		FacultyOfBusienessEconomicsAndStatistics.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfBusienessEconomicsAndStatistics.setBorder(raisedBevelBorder);
		
		FacultyOfBusienessEconomicsAndStatistics.addActionListener(this);
		
		
		
		
		FacultyOfCoumputerScience.setBackground(Color.BLACK);
		
		FacultyOfCoumputerScience.setForeground(Color.WHITE);
		
		FacultyOfCoumputerScience.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfCoumputerScience.setBorder(raisedBevelBorder);
		
		FacultyOfCoumputerScience.addActionListener(this);
		
		
		
		
		FacultyOfHistoryAndCulturelStudies.setBackground(Color.BLACK);
		
		FacultyOfHistoryAndCulturelStudies.setForeground(Color.WHITE);
		
		FacultyOfHistoryAndCulturelStudies.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfHistoryAndCulturelStudies.setBorder(raisedBevelBorder);
		
		FacultyOfHistoryAndCulturelStudies.addActionListener(this);
		
		
		
		FacultyOfPhilologicalCulturelStudies.setBackground(Color.BLACK);
		
		FacultyOfPhilologicalCulturelStudies.setForeground(Color.WHITE);
		
		FacultyOfPhilologicalCulturelStudies.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfPhilologicalCulturelStudies.setBorder(raisedBevelBorder);
		
		FacultyOfPhilologicalCulturelStudies.addActionListener(this);
		
		
		
		
		FacultyOfPsychology.setBackground(Color.BLACK);
		
		FacultyOfPsychology.setForeground(Color.WHITE);
		
		FacultyOfPsychology.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfPsychology.setBorder(raisedBevelBorder);
		
		FacultyOfPsychology.addActionListener(this);
		
		
		
		
		FacultyOfSocialSciences.setBackground(Color.BLACK);
		
		FacultyOfSocialSciences.setForeground(Color.WHITE);
		
		FacultyOfSocialSciences.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfSocialSciences.setBorder(raisedBevelBorder);
		
		FacultyOfSocialSciences.addActionListener(this);
		
		
		
		
		FacultyOfMathematics.setBackground(Color.BLACK);
		
		FacultyOfMathematics.setForeground(Color.WHITE);
		
		FacultyOfMathematics.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfMathematics.setBorder(raisedBevelBorder);
		
		FacultyOfMathematics.addActionListener(this);
		
		
		
		FacultyOfPhysics.setBackground(Color.BLACK);
		
		FacultyOfPhysics.setForeground(Color.WHITE);
		
		FacultyOfPhysics.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfPhysics.setBorder(raisedBevelBorder);
		
		FacultyOfPhysics.addActionListener(this);
		
		
		
		
		FacultyOfChemistry.setBackground(Color.BLACK);
		
		FacultyOfChemistry.setForeground(Color.WHITE);
		
		FacultyOfChemistry.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfChemistry.setBorder(raisedBevelBorder);
		
		FacultyOfChemistry.addActionListener(this);
		
		
		
		
		FacultyOfEarthSciencesGeographyAndAstronomy.setBackground(Color.BLACK);
		
		FacultyOfEarthSciencesGeographyAndAstronomy.setForeground(Color.WHITE);
		
		FacultyOfEarthSciencesGeographyAndAstronomy.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfEarthSciencesGeographyAndAstronomy.setBorder(raisedBevelBorder);
		
		FacultyOfEarthSciencesGeographyAndAstronomy.addActionListener(this);
		
		
		
		
		FacultyOfLifeSciences.setBackground(Color.BLACK);
		
		FacultyOfLifeSciences.setForeground(Color.WHITE);
		
		FacultyOfLifeSciences.setFont(new Font("SERIF",Font.ITALIC,22));
		
		FacultyOfLifeSciences.setBorder(raisedBevelBorder);
		
		FacultyOfLifeSciences.addActionListener(this);
		
		
		
		CentreForTranslationalStudies.setBackground(Color.BLACK);
		
		CentreForTranslationalStudies.setForeground(Color.WHITE);
		
		CentreForTranslationalStudies.setFont(new Font("SERIF",Font.ITALIC,22));
		
		CentreForTranslationalStudies.setBorder(raisedBevelBorder);
		
		CentreForTranslationalStudies.addActionListener(this);
		
		
		
		CentreForSportSciencesandUniversitySport.setBackground(Color.BLACK);
		
		CentreForSportSciencesandUniversitySport.setForeground(Color.WHITE);
		
		CentreForSportSciencesandUniversitySport.setFont(new Font("SERIF",Font.ITALIC,22));
		
		CentreForSportSciencesandUniversitySport.setBorder(raisedBevelBorder);
		
		CentreForSportSciencesandUniversitySport.addActionListener(this);
		
		
		
		CentreForMoleculerBiology.setForeground(Color.WHITE);
		
		CentreForMoleculerBiology.setBackground(Color.BLACK);
		
		CentreForMoleculerBiology.setFont(new Font("SERIF",Font.ITALIC,22));
		
		CentreForMoleculerBiology.setBorder(raisedBevelBorder);
		
		CentreForMoleculerBiology.addActionListener(this);
		
		
		
		CentreForMicroBiologyAndEnvironmentalScience.setBackground(Color.BLACK);
		
		CentreForMicroBiologyAndEnvironmentalScience.setForeground(Color.WHITE);
		
		CentreForMicroBiologyAndEnvironmentalScience.setFont(new Font("SERIF",Font.ITALIC,22));
		
		CentreForMicroBiologyAndEnvironmentalScience.setBorder(raisedBevelBorder);
		
		CentreForMicroBiologyAndEnvironmentalScience.addActionListener(this);
		
		
		
		CentreForTeacherEducation.setBackground(Color.BLACK);
		
		CentreForTeacherEducation.setForeground(Color.WHITE);
		
		CentreForTeacherEducation.setFont(new Font("SERIF",Font.ITALIC,22));
		
		CentreForTeacherEducation.setBorder(raisedBevelBorder);
		
		CentreForTeacherEducation.addActionListener(this);
	
		
		logOut.setBackground(Color.BLACK);

		logOut.setForeground(Color.WHITE);
		
		logOut.setFont(new Font("SERIF",Font.ITALIC,22));
		
		logOut.setBorder(lineBorder);
		
		logOut.addActionListener(this);
		
		
		back.setBackground(Color.BLACK);
		
		back.setForeground(Color.WHITE);
		
		back.setFont(new Font("SERIF",Font.ITALIC,22));
		
		back.setBorder(lineBorder);
		
		back.addActionListener(this);
		
		
		
		
		panel.add(facultyOfCatholicTheology);
		
		panel.add(FacultyOfProtestanTheology);
		
		panel.add(FacultyOfSocialSciences);
		
		panel.add(FacultyOfPsychology);
		
		panel.add(FacultyOfBusienessEconomicsAndStatistics);
		
		panel.add(CentreForMicroBiologyAndEnvironmentalScience);
		
		panel.add(CentreForMoleculerBiology);
		
		panel.add(CentreForSportSciencesandUniversitySport);
		
		panel.add(CentreForTeacherEducation);
		
		panel.add(CentreForTranslationalStudies);
		
		panel.add(FacultyOfBusienessEconomicsAndStatistics);
		
		panel.add(FacultyOfChemistry);
		
		panel.add(FacultyOfCoumputerScience);
		
		panel.add(FacultyOfEarthSciencesGeographyAndAstronomy);
		
		panel.add(FacultyOfHistoryAndCulturelStudies);
		
		panel.add(FacultyOfLaw);
		
		panel.add(FacultyOfLifeSciences);
		
		panel.add(FacultyOfMathematics);
		
		panel.add(FacultyOfPhilologicalCulturelStudies);
		
		panel.add(back);
		
		panel.add(logOut);
		
		
		
		
		
		
		setSize(600,600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setResizable(false);
		
		setVisible(true);
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		
		if(o==facultyOfCatholicTheology) {
			
			new FacultyOfCatholicTheology();
			
			dispose();
			
		}
		else if(o==back) {
			
			new MainPage();
			
			dispose();
		}
		else if(o==logOut) {
			
			new LoginPage();
			
			dispose();
		}
		
		
		
	}
	
	

}
