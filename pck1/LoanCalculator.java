package pck1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application{

	private TextField tfAnnualIntrestRate = new TextField();
	private TextField tfTotalPayment = new TextField();
	private TextField tfMonthlyPayment = new TextField();
	private TextField tfLoanAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private Button calc = new Button("Calculate");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		GridPane gridPane = new GridPane();
		gridPane.add(new Label("Annual Interest Rate"), 0, 0);
		gridPane.add(tfAnnualIntrestRate, 1, 0);
		gridPane.add(new Label("NumberOfYears"), 0, 1);
		gridPane.add(tfNumberOfYears, 1, 1);
		gridPane.add(new Label("Loan Amount"), 0, 2);
		gridPane.add(tfLoanAmount, 1, 2);
		gridPane.add(new Label("Monthly Payment"), 0, 3);
		gridPane.add(tfMonthlyPayment, 1, 3);
		gridPane.add(new Label("Total Payment"), 0, 4);
		gridPane.add(tfTotalPayment, 1, 4);
		gridPane.add(calc, 1, 5);
		
		gridPane.setAlignment(Pos.CENTER);
		tfAnnualIntrestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
		GridPane.setHalignment(calc, HPos.RIGHT);
		
		calc.setOnAction(e->calculateLoanPayment());
		
	}

	private void calculateLoanPayment() {

		double interest = Double.parseDouble(tfAnnualIntrestRate.getText());
		int year = Integer.parseInt(tfNumberOfYears.getText());
		double loanAmount = Double.parseDouble(tfLoanAmount.getText());
		
		Loan loan = new Loan(interest,year,loanAmount);
		
		
	}

}
