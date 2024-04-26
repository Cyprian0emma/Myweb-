package com.AtmMachine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    //my variables
    private int customerNumber;
    private  int pinNumber;
    private double savingBalance = 0;
    private double checkingBalance = 0 ;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    /*SEt customer number*/

    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    // GEt the customer number

    public  int getCustomerNumber(){

        return  customerNumber;
    }
    //set pin number
    public  int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    //Get pin number

    public  int getPinNumber(){
        return  pinNumber;
    }

    //get checking account balance
    public  double getCheckingBalance(){
        return checkingBalance;
    }
//get saving account balance
    public  double getSavingBalance(){

        return savingBalance;
    }

//calculating checking account withdrawal
    public  double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    //calculate saving account withdrawal

    public  double calcSavingWithdraw(double amount){

        savingBalance =savingBalance-amount;
        return  savingBalance;
    }
 /*calculate check account deposit*/
    public   double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
        //calculate saving account deposit

    public double calcSavingDeposit(double amount){
        savingBalance = savingBalance + amount;
        return savingBalance;
    }
    // customer checking accounting withdraw input

public void getCheckingWithdrawInput() {
    System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
    System.out.print("Amount you want to withdraw from Checking Account: ");
    double amount = input.nextDouble();

    if ((checkingBalance-amount)>=0){
        calcCheckingWithdraw(amount);
        System.out.println("New checking Account balance: " + moneyFormat.format(checkingBalance));
    } else {
        System.out.println("Balance cannot be negative. \n ");
    }
    }


    //customer saving Account withdraw Input

public void getSavingWithdrawalInput(){
    System.out.println("Saving Account Balance"+moneyFormat.format(savingBalance));
    System.out.print("Amount you want to withdraw from saving account: ");
    double amount = input.nextDouble();

    if ((savingBalance-amount)>=0){
        calcSavingWithdraw(amount);
        System.out.println("New Checking Account balance" + moneyFormat.format(savingBalance));

    }else {
        System.out.println("your Account is null ");
    }

    }

    public void  getCheckingDepositInput(){
        System.out.println("checking Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit from checkingAccount: ");
        double amount = input.nextDouble();

        if ((checkingBalance+amount)>=0 ){
            calcCheckingDeposit(amount);
            System.out.println(" new Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance cannot be negative. \n");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposit from Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance+amount)>=0 ){
            calcSavingDeposit(amount);
            System.out.println(" new Saving Account Balance: " + moneyFormat.format(savingBalance));
        }else {
            System.out.println("Balance cannot be negative. \n");
        }
        }











}
