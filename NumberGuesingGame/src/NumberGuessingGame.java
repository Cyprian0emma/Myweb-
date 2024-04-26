import java.util.Random;
import java.util.Scanner;

public  class NumberGuessingGame
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100);

        //System.out.println("Rondom number is: " + randomNumber);
       int trycount = 0;
        while (true) {
            System.out.print("Enter your guesse (1-100): ");
            int playerGuess = input.nextInt();
           trycount++;
            if (playerGuess == randomNumber) {
                System.out.println("Correct! you win!");
                System.out.println("It took you " +trycount + "  tries");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher . Guess again");
            } else {
                System.out.println("Nope the number is lower. Guess again.");
            }
        }

    }
}