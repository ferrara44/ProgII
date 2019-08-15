package TP2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int numberarray[]= new int[10];
		int pos, neg, zero=0;
		Scanner integers = new Scanner(System.in);
		
		System.out.printf("Please enter 10 integers./n");
		
		for(int i=0; i<10; i++) {
			System.out.println("Enter integer for the position "+i);
			numberarray[i]=integers.nextInt();
			System.out.printf(numberarray[i]);
		}
		
	}
	
}
