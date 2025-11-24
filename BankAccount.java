// Create a class “Account‟ to represent a bank account.
// Write a program to deposit and withdraw amounts from the account.

import java.util.Random;
import java.util.Scanner;

class Account {
    public String accnName;
    public int accNumber;
    public double balance;

    public Account(String accName, double balance) {
        this.accnName = accName;
        this.balance = balance;
        Random random = new Random();
        this.accNumber = random.nextInt(1000000);
        System.out.println("Your new account number is:" + accNumber);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully...");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrew successfully...");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void details() {
        System.out.println("\nName of the Account:" + accnName + "\nBalance amount in the account:" + balance);
    }
}

public class BankAccount {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] s) {
        System.out.println("WELCOME TO XYZ BANK\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name:- ");
        String accName = scan.next();
        System.out.print("Enter your opening balance: ");
        double balance = scan.nextDouble();
        Account bankAcc = new Account(accName, balance);
        int continueState = 0;
        while (continueState == 0) {
            System.out.println("\nHow can i help you?");
            System.out.println("1. Deposit amount");
            System.out.println("2. Withdraw amount");
            System.out.println("3. Account details");
            System.out.println("4. Exit");
            System.out.print("Enter an action number:- ");
            int currentProcess = scan.nextInt();
            switch (currentProcess) {
                case 1 -> {
                    System.out.print("\nEnter amount to deposit: ");
                    bankAcc.deposit(scan.nextDouble());
                }
                case 2 -> {
                    System.out.print("\nEnter amount to withdraw: ");
                    bankAcc.withdraw(scan.nextDouble());
                }
                case 3 -> bankAcc.details();
                default -> {
                    System.out.println("\n\nTHANK YOU");
                    scan.close();
                    return;
                }
            }
        }
        scan.close();
    }
}