package com.javaLab;

import javax.swing.event.SwingPropertyChangeSupport;
import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        char choice,ignore;

        do {
            System.out.println("Help on");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do while");
            System.out.print("Choose one: ");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();

            } while (ignore != '\n');
        }while (choice < '1'| choice > '5');
        System.out.println("\n");


        switch (choice){
            case '1':
                System.out.println("The if \n");
                System.out.println("if(condition) statement \n");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch: \n");
                System.out.println("Switch(expression) {");
                System.out.println("case constant: ");
                System.out.println("  statement sequence");
                System.out.println("break;");
                System.out.println("......//\n");
                System.out.println("}");
                break;
            case '3':
                System.out.println("the for:\n ");
                System.out.println("for (intialization; condition; iteration)");
                System.out.println("Statement");
                break;
            case '4':
                System.out.println(" the while: \n");
                System.out.println(" initialization");
                System.out.println("while(condion) statement");
                break;
            case '5':
                System.out.println("The do-while:");
                System.out.println("do {");
                System.out.println("statement");
                System.out.println("} while (condition);");
                System.out.println("\n");
                break;



        }


    }
}
