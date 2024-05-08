import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxAttempts = 5; // Maximum number of attempts
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        int guess;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between 1 and 100. Try to guess it!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber + ".");
        }

        scanner.close();
    }
}
