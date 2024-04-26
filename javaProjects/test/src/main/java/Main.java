package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BasicCalculator Calculator = new BasicCalculator();

        boolean running = true;

        while (running) {

            System.out.println("Select your operator");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division ");
            System.out.println("5.Exit");

            System.out.print("select(1-5): ");

            int selection;
            while (true) {
                if (input.hasNextInt()) {
                    selection = input.nextInt();
                    if (selection >= 1 && selection <= 5) {
                        break;
                    } else {
                        System.out.println("Invalid option. Please select a number between 1 and 5.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next(); // consume the invalid token to prevent an infinite loop
                }
                System.out.print("Select (1-5): ");
            }


                if (selection == 5) {
                    running=false;
                    break;

                }

                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

            try {
                double result = 0;

                switch (selection) {

                    case 1:
                        result = Calculator.Add(num1, num2);
                        break;
                    case 2:
                        result = Calculator.Subtract(num1, num2);
                        break;
                    case 3:
                        result = Calculator.Multiply(num1, num2);
                        break;
                    case 4:
                        result = Calculator.Division(num1, num2);
                        break;
                    default:
                        System.out.println("invalid selection");
                        continue;
                }

                System.out.println("Results: " + result);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());

            }
            System.out.print("Do another calculation? (yes/no): ");
            String another = input.next();
            if (another.equalsIgnoreCase("no")) {
            running = false;
            }
        }

        input.close();


    }
}





