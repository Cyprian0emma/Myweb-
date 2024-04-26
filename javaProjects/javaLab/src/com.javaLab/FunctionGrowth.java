package com.javaLab;

public class FunctionGrowth
{
    public static void main(String[] args) {

        System.out.println("Log n \t n\t n\t n Log n \n n^2 \t n^3");
        for (int i = 2; i<2048; i*=2){
            System.out.println((int) (Math.log(i)) );
            System.out.println("\t");
            System.out.println(i);
            System.out.println("\t");
            System.out.println((int) (i * Math.log(i)) );
            System.out.println("\t");
            System.out.println(i *i);
            System.out.println("\t");
            System.out.println(i*i*i);
            System.out.println();






        }

    }
}
