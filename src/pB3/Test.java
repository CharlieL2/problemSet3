package pB3;

public class Test {
	public static void main(String[] args){
		Account dave = new Account(1122,20000);
		dave.setAnnualInterestRate(4.5);
		dave.deposit(3000);
		
		try{
			dave.withdraw(2500);
		}
		catch (InsufficientFundsException ex) {
			System.out.println("You're poor.");
			ex.printStackTrace();
			
		}
		
		
		System.out.println(dave.getBalance());
		System.out.println(dave.getMonthlyInterestRate());
		System.out.println(dave.getDateCreated());
		
	}
}
