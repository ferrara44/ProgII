package TP3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Bonus: Yes.
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		
		int log = 0;
		int number = 0;
		ArrayList<String> names = new ArrayList<String>(0);
		ArrayList<Integer> ids = new ArrayList<Integer>(0);
		ArrayList<Integer> ages = new ArrayList<Integer>(0);
		Scanner reader = new Scanner(System.in);
		String menu = "", data = "";
		
		
		
		while(!"n".equals(menu)) {
				System.out.println("Please enter a name");
				data = reader.next();
				names.add(data);
				System.out.println("Enter "+names.get(log)+"'s dni");
				number = reader.nextInt();
				ids.add(number);
				System.out.println("Enter "+names.get(log)+"'s age");
				number = reader.nextInt();
				ages.add(number);
				System.out.println("Do you wish to log another person? (y/n)");
				menu = reader.next();
				if(!"n".equals(menu)) log++;
		}
		
		String[][]matrix=new String[names.size()][3];
		
		
		for (int i=0 ; i<=log ; i++) {
			matrix[i][0]=names.get(i);
		}
		for (int i=0 ; i<=log ; i++) {
			matrix[i][1]=Integer.toString(ids.get(i));
		}
		for (int i=0 ; i<=log ; i++) {
			matrix[i][2]=Integer.toString(ages.get(i));
		}
		
		System.out.println();
		
		/*
		 * At this point we have our 2D array and can start sorting it.
		 */
		
		Arrays.sort(matrix, new Comparator<String[]>() {
            public int compare(String[] n1, String[] n2) {
                String name1 = n1[0];
                String name2 = n2[0];
                return name1.compareTo(name2);
            }
        });
		
		System.out.println();
		for (int j=0 ; j<3 ; j++) {
			for (int i=0 ; i<=log ; i++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		reader.close();
	}
}

