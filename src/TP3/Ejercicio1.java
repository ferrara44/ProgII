package TP3;

import java.util.ArrayList;
/*  I'm going to use ArrayList because it's
	more time and space efficient.
	While also providing dynamic array size.
*/
public class Ejercicio1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numpool = new ArrayList<Integer>(100);
		ArrayList<Integer> mixedpool = new ArrayList<Integer>(0);
		
		for(int i=1 ; i<=100 ; i++) {
			numpool.add(i);
		}
		
		for(int i=1 ; i<=100 ; i++) {
			int selector = generate(numpool.size());
			int buffer = numpool.get(selector);
			mixedpool.add(buffer);
			numpool.remove(selector);
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