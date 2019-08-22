package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int[][]matrix = new int[3][3];
		int []arr = new int [9];
		int pos = 0;
		Scanner scan = new Scanner(System.in);
		//Generate the matrix.
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.println("Enter a number for position ["+i+"]["+j+"]");
				matrix[i][j]=scan.nextInt();
			}
		}
		//Prepare for sorting.
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				arr[pos] = matrix[i][j];
				pos++;
			}
		}
		
		System.out.println();
		System.out.println();
		Arrays.sort(arr); //Sorting
		
		//Reorder using a looped swapping algo.
		for (int l=0, r=(arr.length-1); l<r; l++, r--) {
		    int buffer = arr[l]; arr[l] = arr[r]; arr[r] = buffer;
		}
		//Reconstruct the matrix.
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
