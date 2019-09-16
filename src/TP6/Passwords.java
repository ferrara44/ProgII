
package TP6;

import java.util.Scanner;

public class Passwords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please select amount of passwords to generate:");
        int amount = scan.nextInt();
        System.out.println("Select password lenght: ");
        int cant =scan.nextInt();
        Generate[] password = new Generate[amount];

        for(int i = 0 ; i < amount ; i++) {
            password[i] = new Generate(cant);
        }
        System.out.println("The following Passwords have been generated:");
        for (int i=0;   i<amount; i++){
        	System.out.print(password[i].getPass()+ password[i].getLength());
            if (password[i].getSafety()){
                System.out.println("\t Safe");
            }else   System.out.println("\tUnsafe"); //looks nicer this way. Imo.

        }

        scan.close();
    }

}