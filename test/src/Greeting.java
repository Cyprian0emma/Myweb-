import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Greeting sum = new Greeting();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        input.close();


        System.out.println(sum.createGreeting(name));

    }

    public String createGreeting(String name) {
        return "Hello  "+ name +"!";
    }
}