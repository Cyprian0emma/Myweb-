package com.javaLab;

public class ALLEqual {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d;
        d = Integer.parseInt(args[3]);
        int e ;
        e = Integer.parseInt(args[4]);

int avg =( (a + b + c+ d + e)/5);
int median= (a+e)/2;

        System.out.println(a + "\t" + b + "\t " + c + "\t" +  d + "\t" + e);
        System.out.println("avarage: \t" + avg);
        System.out.println(" median: \t" +median );
//Return prime numbers
        double num,sroot,rerr;
        for ( num = 1.0; num <100; num++) {
sroot =Math.sqrt(num);
            System.out.println("Square Root of "+ num + "is" + sroot);

            //compute rounding error
            rerr = num - (sroot*sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println("\n");


        }

        }

    }



