package TP4;

public class UsoCuenta {

	public static void main(String[] args) {

		CuentaCorriente cuenta1 = new CuentaCorriente("Cuenta1",1000);
		CuentaCorriente cuenta2 = new CuentaCorriente("Cuenta2",1000);
		
		cuenta1.transfer(cuenta2, 200);
		cuenta1.getInfo();
		cuenta2.getInfo();

	}
	
	

}
