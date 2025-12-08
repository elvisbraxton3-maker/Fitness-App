class BankAccount {
     double balance;

     void deposit(double account) {
        balance + =amount;
     }
    }
class SavingsAccount extends BankAccount{
    void addInterest() {
        balance += balance *0.05;
    }
}

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    SavingsAccount acc =new SavingsAccount();

       System.out.print("Enter deposit amount:");
       double amount =sc.nextDouble();

       acc.deposit(amount);
       acc.addInterest();

       System.out.println("Final Balance:" + acc.balance);
       
}
}
    

     
