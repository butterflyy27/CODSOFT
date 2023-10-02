import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;

        System.out.println("Number Guessing Game!");
        do 
        {
            int correctNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("The number is between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it correctly.");

            while (attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == correctNumber) 
                {
                    System.out.println("Amazing! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (userGuess < correctNumber) 
                {
                    System.out.println("Too low! Try again.");
                } else 
                {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) 
            {
                System.out.println("Sorry, you are out of attempts. The correct number was: " + correctNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("no")) 
            {
                break;
            }
        }
        while (true);

        System.out.println("Thank you for playing! Your total score is: " + score);
        scanner.close();
    }
}
