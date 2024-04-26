package com.javaLab;

public class FindCost{
    public static void main( String args[]){
        double oldPrice,newPrice,tax;
        oldPrice=500;
        tax=17.5; // tax is 17.5%
        newPrice=oldPrice*(1+tax/100); // calculate new price after tax
        System.out.println( "*** Product price Check *** \n" );
        System.out.println( "Cost before tax = " + oldPrice+ "\n");
        System.out.println( "Cost after tax = " + newPrice);
    }
}
