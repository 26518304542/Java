package pck1;

public class Loan {

	double interest,loanAmount;
	int year;
	
	public Loan(double interest,int year,double loanAmount) {
		
		this.interest = interest;
		this.year = year;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	
	public double getInterest() {
		
		return interest;
	}
	
	public double getLoanAmount() {
		
		return loanAmount;
	}
	
	public int getYear() {
		
		return year;
	}
	
}
