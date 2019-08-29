package TP2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int numberarray[]= new int[10];
		int pos=0, neg=0, zero=0;
		Scanner integerscan = new Scanner(System.in);
		
		System.out.println("Please enter 10 integers.");
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println("Enter integer for the position "+(i+1));
			numberarray[i]=integerscan.nextInt();
			
		}
		
		//for(int i=0 ; i<10 ; i++) {
		//	System.out.print(numberarray[i]+" ");
		//}
		
		for(int i=0 ; i<10 ; i++) {
			if(numberarray[i]==0) {
				zero++;
			}
			else if(numberarray[i]>0){
				pos++;
			}
			else {
				neg++;
			}
		}
		System.out.println("Your entered values array contain");
		System.out.println(zero+" occurrences of 0");
		System.out.println(pos+" occurrences of positive values.");
		System.out.println(neg+" occurrences of negative values.");
		integerscan.close();
	}
}
