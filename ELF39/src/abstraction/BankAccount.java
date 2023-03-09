package abstraction;

public class BankAccount {
	private String name;
	private double balance=0.0;
	
	public BankAccount(String name) {//constructor
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double amt) {
		balance=balance+amt;
	}
	
	



}
