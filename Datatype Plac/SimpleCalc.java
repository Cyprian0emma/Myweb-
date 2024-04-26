import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);


                System.out.print("enter  the first number: ");
        double num1 = input.nextFloat();
        System.out.println("enter your operation : ");
        char operation = input.next().charAt(0);
        System.out.print("enter the second number: ");
        double num2 = input.nextDouble();
         double result = 0;

        if ( operation == '+' ){
             result =  (num1 + num2 );
        }
        else if ( operation == '-'){
            result = num1 - num2 ;
        }
        else if (operation == '*' ){
            result = num1 * num2;
        }

        else if(operation == '/'){
            if (num2 !=0) {
                result = num1 / num2;
            }
            else {
                System.out.println("Error: cannot divide by zero");
            }

            }
        else {
            System.out.println(" UNKNOWN OPERATION");
        }

        System.out.println("RESULT : " + result);
    }
}












