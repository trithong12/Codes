package Exercise9_7;

import java.util.Date;

public class Account {
	private int id=0;
	private double balance=0;
	private static double annualInterestRate=0;
	private Date dateCreated;
	
	Account() {} //constructor
	
	Account(int id, double balance) { //constructor
		this.id=id;
		this.balance=balance;
		dateCreated = new java.util.Date(); //get date created
	}
	
	public int getId() {  // id's accessor method
		return id;
	}
	
	public double getBalance() { // balance's accessor method
		return balance;
	} 
	
	public static double getAnnualInterestRate() { // annualInterestRate's accessor method
		return annualInterestRate;
	} 
	
	public Date getDateCreated() { //dateCreated's accessor method
		return dateCreated; 
	} 
	
	public void setId(int newId) {	//id's mutator method
		this.id = (newId > 0) ? newId : 0;
	}
	
	public void setBalance(double newBalance) {  // balance's mutator method
		this.balance = (newBalance > 0) ? newBalance : 0;
	}
	
	public static void setAnnualInterestRate(double newAnnualInterestRate) {  // annualInterestRate's mutator method
		annualInterestRate = (newAnnualInterestRate > 0) ? newAnnualInterestRate : 0;
	}
	
	double getMonthlyInterestRate() {
		return (annualInterestRate/100)/12;
	}
	
	double getMonthlyInterest() {
		return balance*this.getMonthlyInterestRate();
	}
	
	void withdraw(double amountOfWithdrawing) {
		System.out.printf("\nYou has withdrawed $%f\n"
				+ "your current balance is: $%f\n", amountOfWithdrawing, this.balance-amountOfWithdrawing);
		this.balance=this.balance-amountOfWithdrawing; //update this.balance
	}
	
	void deposit(double amountOfDepositing) {
		System.out.printf("\nYou has deposited $%f\n"
				+ "your current balance is: $%f\n", amountOfDepositing, this.balance+amountOfDepositing);
		this.balance=this.balance+amountOfDepositing; //update this.balance
	}
}
