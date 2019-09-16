package Clases.Clase5;

import java.util.Scanner;

public class CuentaCorriente {

    private String customer;
    private double balance;
    private long account;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CuentaCorriente[] customers = new CuentaCorriente[2];
        double input;
        int option = 1;
        int id;

        for (int i=0;   i<customers.length;  i++){
            System.out.println("Enter a name for the owner of account N�" +(i+1)+ ".");
            String name = scan.next();
            System.out.println("Please enter a starting balance for this account.");
            double startingBalance = scan.nextDouble();
            customers[i] = new CuentaCorriente(name, startingBalance);
        }

        while (option !=0){
            System.out.println("Please enter an option:");
            System.out.println("1- Deposit");
            System.out.println("2- Withdraw");
            System.out.println("3- Display Balance");
            System.out.println("4- Display ID");
            System.out.println("5- Transfer");
            System.out.println("0- Exit");
            option = scan.nextInt();

            switch (option){
                case 1:{
                    System.out.println("Please enter the unique account ID to deposit to.");
                    id = scan.nextInt();
                    if (id == 1 || id == 2){
                        System.out.println("Please enter the amount to deposit.");
                        input = scan.nextDouble();
                        customers[id-1].setDeposit (input);
                        System.out.println("Success.");
                    }else System.out.println("Invalid ID.");
                    break;
                }
                case 2:{
                    System.out.println("Please enter the unique account ID to withdraw from.");
                    id = scan.nextInt();
                    if (id == 1 || id == 2){
                        System.out.println("Please enter the amount to withdraw.");
                        input = scan.nextDouble();
                        customers[id-1].setWithdraw (input);
                    }else System.out.println("Invalid ID.");
                    break;
                }
                case 3:{
                    System.out.println("Please enter the unique account ID.");
                    id = scan.nextInt();
                    if (id == 1 || id == 2){
                        System.out.println("Current balance for this account is $" + customers[id-1].getBalance());
                    }else System.out.println("Invalid ID.");
                    break;
                }
                case 4:{
                    System.out.println("Please enter the unique account ID.");
                    id = scan.nextInt();
                    if (id == 1 || id == 2) {
                        System.out.println("Information for account " +(id)+ ":" + customers[id - 1].getInfo());
                    } else System.out.println("Invalid ID.");
                    break;
                }
                case 5:{
                    System.out.print("Please enter the unique account ID to transfer from.");
                    int sender = scan.nextInt();
                    System.out.print("Please enter the unique account ID to transfer to.");
                    int payee = scan.nextInt();
                    System.out.print("Enter the amount to be transferred.");
                    int amount = scan.nextInt();
                    customers[sender-1].transfer(customers[payee-1], amount);
                    break;
                }
                case 0: break;
            }

        }

        scan.close();
    }
    
    public CuentaCorriente(String customer, double balance){
        this.customer = customer;
        this.balance = balance;
        this.account = (long) (Math.random()*10000+1);
    }


    public double getBalance(){
        return balance;
    }
    
    public void setWithdraw(double balance){
        if (this.balance > balance){
            this.balance -= balance;
        }
        else System.out.println("There is not enough money to complete this operation.");;
    }
    
    public void setDeposit(double balance){
        this.balance += balance;
    }

    public String getInfo(){
        return  "\n" +
                "Id: " + customer + "\n" +
                "Account No: " + account + "\n" +
                "Current Balance: " + balance;
    }

    public void transfer(CuentaCorriente payee, double value){
        this.balance -= value;
        payee.balance += value;
    }
    

}