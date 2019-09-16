package TP4;

public class CuentaCorriente {
	
	private String account;
	private double balance;
	private long id;
	
	public CuentaCorriente(String account, double balance) {

		this.account=account;
		this.balance=balance;
		this.id=(long)(Math.random()*99999);
	}

	//getters
	
	public void getInfo() {
		System.out.println("Account Name: "+this.account+"\n");
		System.out.println("Current Balance: "+this.balance+"\n");
		System.out.println("ID:"+this.id+"\n");
	}

	public double getBalance() {
		return this.balance;
	}
	
	//setters
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
		getBalance();
	}
	
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
		getBalance();
	}
	
	//transfer
	
	public void transfer(CuentaCorriente destination, double amount) {
		this.balance -= amount;
		destination.balance += amount;
	}
	
}