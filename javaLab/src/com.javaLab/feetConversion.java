package com.javaLab;

public class feetConversion {
    public static void main(String[] args) {

        double inches, meters ,results ;
        int count;

        count=0;
        for (inches=0; inches<=100; inches++) {

            meters = ((1 * inches) / 39.37);
            System.out.println(inches + "inches " +" is equals to " + meters +"meters " );
                count++;
                if(count == 12){
                    System.out.println( );
                    count=0;
                }

        }


    }
}
