import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicCalculator calculator = new BasicCalculator();
        boolean running = true;

        System.out.println("Welcome to the Basic Calculator!");

        while (running) {
            System.out.println("Choose an operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit");
            System.out.print("Select (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                running = false;
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            try {
                double result = 0;
                switch (choice) {
                    case 1:
                        result = calculator.add(num1, num2);
                        break;
                    case 2:
                        result = calculator.subtract(num1, num2);
                        break;
                    case 3:
                        result = calculator.multiply(num1, num2);
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operation selection.");
                        continue;
                }
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Do another calculation? (yes/no): ");
            String another = scanner.next();
            if (another.equalsIgnoreCase("no")) {
                running = false;
            }
        }

        System.out.println("Thank you for using the Basic Calculator!");
        scanner.close();
    }
}
