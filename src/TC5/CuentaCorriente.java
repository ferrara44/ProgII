package TC5;

import java.util.ArrayList;
import java.util.Random;

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
		
		ArrayList<CuentaCorriente> Arr = new ArrayList<CuentaCorriente>();
		
		for(int i=0 ; i<10 ; i++) {
		    String accountname= "Pepito";
		    double accountbalance = Math.random()*100;
		    long range = 1000000L;
		    Random ran = new Random();
		    long accountnumber = (long)(ran.nextDouble()*range);
		    
		    Arr.add(new CuentaCorriente(accountname, accountbalance, accountnumber));
		}
		
	}
}
