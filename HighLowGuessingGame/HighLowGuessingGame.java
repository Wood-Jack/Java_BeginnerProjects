import java.util.Random;
import java.util.Scanner;

 
public class HighLowGuessingGame {
 
   public static void main(String[] args) {
       
      Random random = new Random(); // Create a random number generator       
      Scanner scanner = new Scanner(System.in); // Use Scanner for getting input from user     
      int number = random.nextInt(100); // pick a number between 0 and 99 (inclusive)
      int guess = -1;
	  int numberOfTries = 0;
	  
	  System.out.print("Guess a number between 0 and 99!");
       
	  // Loop until the user has guessed the number
      while (guess!=number) {
		  
         // Prompt the user for their next guess
          
         System.out.print(" Enter your guess: ");
          
         // Read the users guess
          
         guess = scanner.nextInt();
		 
		 // Add 1 to numberOfTries
		 numberOfTries++;
          
         // Check if the guess is high, low or correct
          
         if (guess<number) {
             
            // Guess is too low
             
            System.out.println("Too low, please try again");
             
         } else if (guess>number) {
 
            // Guess is too high
 
            System.out.println("Too high, please try again");
             
         } else {
             
            // Guess is correct !!
             
			System.out.println("You win!");
            System.out.println("The number was " + number);
			System.out.println("It took you " + numberOfTries + " tries");
         }
      }
   }
 
}