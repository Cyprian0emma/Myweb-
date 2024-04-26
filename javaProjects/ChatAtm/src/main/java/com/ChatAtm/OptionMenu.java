package com.ChatAtm;

import java.util.Scanner;

public class OptionMenu{
     Scanner scanner = new Scanner(System.in);


    public int displayMenu() {
        System.out.println("\n ATM Menu:");
        System.out.println("1. Display Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public double getAmount() {
        System.out.print("Enter amount: $");
        return scanner.nextDouble();
    }

    public String getAccountType() {
        System.out.print("Enter account type (saving/checking): ");
        return scanner.next();
    }
}