package com.javaLab;

import java.util.Scanner;

public  class QuadraticEqn {
    public static void main(String[] args) {
        double a, b , c ;
        Scanner input = new Scanner(System.in);

        System.out.print("enter the value of a: ");
        a =input.nextDouble();

        System.out.print("enter value of b: ");
        b= input.nextDouble();

        System.out.print("enter value of c: ");
        c = input.nextDouble();

// calculate the discriminant
        double dicriminant = b*b- 4.0 * a * c;

        double sqroot =Math.sqrt(dicriminant);

        double  root1 = (-b + sqroot)/2.0;
        double  root2 = (-b - sqroot)/2.0;

        System.out.println("\n \n");
        System.out.println(root1 );
        System.out.println(root2);


    }
}