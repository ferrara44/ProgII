package TP3;

import java.util.Arrays;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int[][]matrix = new int[3][3];
		int []arr = new int [9];
		int pos = 0;
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				matrix[i][j]=(int)(Math.random()*100);
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				arr[pos] = matrix[i][j];
				pos++;
			}
		}
		
		System.out.println();
		Arrays.sort(arr);
		pos=0;
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				matrix[i][j] = arr[pos];
				System.out.print(matrix[i][j]+"\t");
				pos++;
			}
			System.out.println();
		}
	}
}

