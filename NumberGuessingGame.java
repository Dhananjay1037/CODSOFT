package dhanu.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Guess the Number game!");

	        while (true) {
	            // Generated a random number within 1 to 100
	            int randomnumber = new Random().nextInt(100) + 1;
	            
	            int attempts = 0;

	            //Limit the number of attempts
	            int maxAttempts = 10;

	            System.out.println(" Can you guess a number between 1 and 100. Can you guess it in " + maxAttempts + " attempts?");

	            while (attempts < maxAttempts) {
	                //  Prompt the user to enter their guess
	                System.out.print("Enter your guess: ");
	                int userguessnumber = scanner.nextInt();

	                attempts++;
	                if (userguessnumber == randomnumber) {
	                    System.out.println("Congratulations! You guessed the number " + randomnumber + " in " + attempts + " attempts.");
	                    break;
	                } else if (userguessnumber < randomnumber) {
	                    System.out.println("Number is higher than your number! Try again.");
	                } else {
	                    System.out.println("Number is less than your number ! Try again.");
	                }
	            }
	            
	            int score= attempts;
	            
	            if(score == 1) {
	            	
	            	System.out.println("Perfect Your score is 100"); 	
	            }
	            else if(score<=3) {
	            	System.out.println("Too Close Your Score is 90");
	            	
	            }
	            else if(score<=6) {
	            	System.out.println("Nice Try Your Score is 80");
	            }
	            else if(score<=9) {
	            	System.out.println("Practise more your score is 50");
	            }
	            
	            if (attempts == maxAttempts) {
	                System.out.println("Sorry, you've reached the maximum number of attempts Your Score is 0. The correct number was " + randomnumber + ".");
	            }

	            // Step 6: Ask the user if they want to play again
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgain = scanner.next().toLowerCase();
	            if (!playAgain.equals("yes")) {
	                break;
	            }
	        }

	        scanner.close();
	        
	    }//void main ends here

}
