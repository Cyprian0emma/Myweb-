package com.ChatAtm;

public class ATM {

    private  Account account;
    private OptionMenu optionMenu;

    public ATM(Account account) {
        this.account = account;
        this.optionMenu = new OptionMenu();
    }

    public void run() {
        int choice;
        do {
            choice = optionMenu.displayMenu();
            switch (choice) {
                case 1:
                    account.displayBalance();
                    break;
                case 2:
                    double depositAmount = optionMenu.getAmount();
                    String depositAccountType = optionMenu.getAccountType();
                    account.deposit(depositAmount, depositAccountType);
                    break;
                case 3:
                    double withdrawAmount = optionMenu.getAmount();
                    String withdrawAccountType = optionMenu.getAccountType();
                    account.withdraw(withdrawAmount, withdrawAccountType);
                    break;
                case 4:
                    System.out.println("Exiting the ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}



