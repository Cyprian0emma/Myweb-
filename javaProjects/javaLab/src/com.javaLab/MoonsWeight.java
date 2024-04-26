package com.javaLab;

import java.util.Scanner;

public class MoonsWeight {
    public static void main(String[] args) {
        double weight,result;
        final double mWeight = 0.17;

        Scanner input = new Scanner(System.in);

        System.out.print("what is your weight  in kgs: ");
        weight = input.nextDouble();

        result = weight * mWeight;

        System.out.println(" \n your weight at the moon will be  "+ result + "Kgs");

    }
}
