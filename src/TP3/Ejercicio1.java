package TP3;

import java.util.ArrayList;
/* 
 *  Here I used ArrayList because it's
 *	more time and space efficient.
 *	While also providing dynamic array size.
 *
 *	Bonus: Yes.
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numpool = new ArrayList<Integer>(100);
		ArrayList<Integer> mixedpool = new ArrayList<Integer>(0);
		//Generate a 100 item number pool in the first AL
		for(int i=1 ; i<=100 ; i++) {
			numpool.add(i);
		}
		//Now mix it up.
		for(int i=1 ; i<=100 ; i++) {
			int selector = generate(numpool.size());
			int buffer = numpool.get(selector);
			mixedpool.add(buffer);
			numpool.remove(selector); //this makes the numpool AL shorter
		}
		
		for(int k:mixedpool) {
			System.out.print(k+" ");
			}
		}

	public static int generate(int a) {
		int res=(int)(Math.random()*a);
		return res;
	}
}