package TC5;

public class CuentaCorriente {

	private String name;
	private double balance;
	private long account;
	
	public CuentaCorriente(String name, double balance, long account) {
		this.name = name;
		this.balance = balance;
		this.account = account;
	}
	
	public static void main(String args[]){
		
		
		
		CuentaCorriente cuenta1 = new CuentaCorriente("Facu", 123, 345);
	}

}
