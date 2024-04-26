package com.ChatAtm;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double savingBalance;
    private double checkingBalance;

    public Account(int customerNumber, int pinNumber, double savingBalance, double checkingBalance) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
        this.savingBalance = savingBalance;
        this.checkingBalance = checkingBalance;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void deposit(double amount, String accountType) {
        if ("saving".equalsIgnoreCase(accountType)) {
            savingBalance += amount;
        } else if ("checking".equalsIgnoreCase(accountType)) {
            checkingBalance += amount;
        }
    }

    public void withdraw(double amount, String accountType) {
        if ("saving".equalsIgnoreCase(accountType) && savingBalance >= amount) {
            savingBalance -= amount;
        } else if ("checking".equalsIgnoreCase(accountType) && checkingBalance >= amount) {
            checkingBalance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void displayBalance() {
        System.out.println("Saving Balance: $" + savingBalance);
        System.out.println("Checking Balance: $" + checkingBalance);
    }
}

