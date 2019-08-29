package TP2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int numberarray[]= new int[10];
		float acu=0;
		Scanner integerscan = new Scanner(System.in);
		
		System.out.println("Please enter 10 integers.");
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println("Enter integer for the position "+(i));
			numberarray[i]=integerscan.nextInt();
		}
		
		//for(int i=0 ; i<10 ; i++) {
		//	System.out.print(numberarray[i]+" ");
		//}
		
		for(int i=0 ; i<10 ; i++) {
			if(i%2==0) { //Debes utilizar el operador módulo “%”
				acu+=numberarray[i];
				System.out.println(acu);
			}
		}
		System.out.println(acu/5);
		integerscan.close();
	}
}
