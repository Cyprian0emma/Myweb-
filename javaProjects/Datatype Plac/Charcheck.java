import java.util.*;

class CharCheck {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine(); // Consume newline character
        }

        // Loop to analyze each entered string
        for (int i = 0; i < N; i++) {
            String name = in.nextLine();

            // Check if the string is valid and output the result
            if (isValidString(name)) {
                System.out.println("VALID");
            } else {
                System.out.print("3" +
                        "INVALID");
            }
        }
    }

    // Method to validate a string
    public static boolean isValidString(String str) {
        // Regular expressions to match only numbers or only letters (either uppercase or lowercase)
        String numberRegex = "^[0-9]+$";
        String letterRegex = "^[a-zA-Z]+$";

        // Check if the string matches either of the regex
        return str.matches(numberRegex) || str.matches(letterRegex);
    }
}
