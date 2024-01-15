import java.util.Scanner;

public class random-password-generator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Consuming user input for number of letters and numbers 
        System.out.print("Enter the number of lower case letters: ");
        int lowerCaseCount = input.nextInt();

        System.out.print("Enter the number of upper case letters: ");
        int upperCaseCount = input.nextInt();

        System.out.print("Enter the number of digits: ");
        int digitCount = input.nextInt();

        String lower_case_letters = "abcdefghijklmnopqrstuvwxyz";
        String upper_case_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";

        // Setting empty string as current password
        String password = "";

        // Randomly generating lower case letters
        for (int i = 0; i < lowerCaseCount; i++) {
            int rand = (int) (lower_case_letters.length() * Math.random());
            password += lower_case_letters.charAt(rand);
        }

        // Randomly generating upper case letters
        for (int i = 0; i < upperCaseCount; i++) {
            int rand = (int) (upper_case_letters.length() * Math.random());
            password += upper_case_letters.charAt(rand);
        }

        // Randomly generating digits
        for (int i = 0; i < digitCount; i++) {
            int rand = (int) (numbers.length() * Math.random());
            password += numbers.charAt(rand);
        }

        // Shuffling and printing  password
        password = shuffleString(password);

        System.out.println("Generated Password: " + password);
    }

    //  Shuffling  characters in a string
    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int rand = (int) (Math.random() * characters.length);
            char temp = characters[i];
            characters[i] = characters[rand];
            characters[rand] = temp;
        }
        return new String(characters);
    }
}