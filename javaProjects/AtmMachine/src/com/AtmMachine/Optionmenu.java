
package com.AtmMachine;


import com.AtmMachine.Account;

import javax.swing.*;
import java.io.IOException;
import java.security.KeyStore;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public  class  Optionmenu extends Account {
    Scanner menuInput = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    /* validate login info 'customer number and pin number '*/

    public  void getLogin() throws IOException {
        int x = 1;

        do {
            try {
                data.put(9876543, 9878);
                data.put(8989898, 1880);
                data.put(65147663, 1000);

                System.out.println("Welcome to the ATM Project \n\n");


                System.out.print("Enter Your Customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter pin Number: ");
                setPinNumber(menuInput.nextInt());

            }catch (Exception e){
                System.out.println("\n Invalid Characters.Only numbers."+ "\n");
                x = 2;
            }
            for(Map.Entry<Integer, Integer> entry: data.entrySet()) {
                if (entry.getKey()==getCustomerNumber()&& entry.getValue()==getPinNumber()){
                    getAccountType();
                }
            }
            System.out.println("\n Wrong Customer Number or Pin\n");
        }while(x==1);

    }
        // Display account type menu with selection

    public void getAccountType(){

        System.out.println("Select the Account you want to access");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.print("Choice: ");

        selection = menuInput.nextInt();
        switch (selection){

            case 1:
            getchecking();
            break;

            case 2:
            getSaving();
            break;

            case 3:
                System.out.println("Thank You for using ATM,bye.");
                break;

            default:
                System.out.println("\n"+"Invalid Choice"+ "\n");
                getAccountType();

        }
    }
    //Display Checking Account Menu with Selections

    public  void getchecking(){
        System.out.println("Checking account : ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");
        selection = menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                 getCheckingWithdrawInput();
                 getAccountType();
                 break;
            case 3:
                getCheckingDepositInput();
                 getAccountType();
                 break;
            case 4:
                System.out.println("Thank You Using ATM, bye.");
                break;
            default:
                System.out.println("\n Invalid choice.\n");
                getchecking();

        }
    }

    public  void getSaving(){

        System.out.println("Saving account : ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");
        selection = menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                getSavingWithdrawalInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You Using ATM, bye.");
                break;
            default:
                System.out.println("\n Invalid choice.\n");
                getchecking();

        }


    }


    int selection;




}