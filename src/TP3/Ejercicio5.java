package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int[][]matrix = new int[3][3];
		int []arr = new int [9];
		int pos = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.println("Enter a number for position ["+i+"]["+j+"]");
				matrix[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				arr[pos] = matrix[i][j];
				pos++;
			}
		}
		
		System.out.println();
		System.out.println();
		Arrays.sort(arr);
		
		
		for (int lft=0, rgt=arr.length-1; lft<rgt; lft++, rgt--) {
		    int tmp = arr[lft]; arr[lft] = arr[rgt]; arr[rgt] = tmp;
		}
		
		pos=0;
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				matrix[i][j] = arr[pos];
				System.out.print(matrix[i][j]+"\t");
				pos++;
			}
			System.out.println();
		}
		scan.close();
	}
}
