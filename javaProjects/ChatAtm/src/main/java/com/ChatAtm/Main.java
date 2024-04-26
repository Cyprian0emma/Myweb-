package com.ChatAtm;


public class Main {
    public static void main(String[] args) {
        Account account = new Account(123456, 1234, 1000.0, 500.0);
        ATM atm = new ATM(account);
        atm.run();
    }
}
