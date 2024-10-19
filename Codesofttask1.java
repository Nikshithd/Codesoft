import java.util.Random;
import java.util.Scanner;

public class Codesofttask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int roundsPlayed = 0;

        while (true) {
            int numberToGuess = random.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("I've selected a number between 1 and 100. Can you guess what it is?");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    totalScore += (10 - attempts); 
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
                totalScore += 0; 
            }

            roundsPlayed++;
            System.out.println("Your current score: " + totalScore + " after " + roundsPlayed + " rounds.");

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing! Your final score: " + totalScore);
        scanner.close();
    }
}
