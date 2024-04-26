package com.javaLab;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Me.jugged() ;

        int num[][] = new int[3][4];

            for(int i=0; i<3; i++){
                for(int j=0; j<4; j++){
                    num[i][j] = (int)(Math.random()*100);
                  System.out.println(num[i][j]);}

            }
            for (int i= 0; i<3; i++){
                for (int j =0; j < 4; j++){
                    System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }
        System.out.println( );
            for (int n [] : num)
            {
                for(int m: n)
                {
                    System.out.print(m + " ");
                }
                System.out.println( );
            }
    }
}