package pB3;

import java.util.Date;

public class Account {

	private int id = 0;
	
	private double balance = 0;
	
	private double annualInterestRate = 0;
	
	private Date dateCreated = new Date();
	
	public Account(){
		
	}
	
	
	public Account(int idX, double balanceX){
		setId(idX);
		setBalance(balanceX);
	}
	
	public int getId(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setId(int x){
		id = x;
	}
	
	public void setBalance(double x){
		balance = x;
	}
	
	public void setAnnualInterestRate(double x){
		annualInterestRate = x;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	public void withdraw(double x) throws InsufficientFundsException {
		if (x > balance)
			throw new InsufficientFundsException("Insufficient Funds");
		else
			balance = balance - x;
	}
	
	public void deposit(double x){
		balance = balance + x;
	}
}
