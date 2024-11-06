import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        // Convert to lowercase to handle both uppercase and lowercase input
        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " is a vowel.");
        } else if ((letter >= 'a' && letter <= 'z')) {
            System.out.println(letter + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }
    }
}
