package com.javaLab;

public class GalToLitTable {
    public static void main(String[] args) {

        double gallons ,liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons<=100; gallons++)
        {
            liters = gallons * 3.7854;
            System.out.println(gallons +"  gallon is  " +liters + "liters");

            counter++;
            //every tenth lie print a blank line
            if(counter==10){
                System.out.println();
                counter= 0; //reset the line counter
            }
        }
    }
}
