import java.util.Random;
import java.util.Scanner;

public class guessing_game{
    public static void main(String[] args) {
        // Intializing Scanner and Random objects
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // Intializing Variables
        int l_lim = 0;
        int u_lim = 100;
        int max_attempts = 7;
        int tot_attempts = 0;
        int rounds = 0;

        // Starting Game
        System.out.println("Welcome to the Guessing Game!!!");
        do{
            // Randomly fixing a number to b guessed
            int actual_number = random.nextInt(u_lim - l_lim + 1) - l_lim;
            int attempts = 0;

            // Dividing the game into several rounds
            System.out.println("\nRound: "+(rounds+1)+":-- Guess the number within the range of "+l_lim+" to "+u_lim);

            while(attempts < max_attempts){
                System.out.print("Enter your guess: ");
                int user_guess = in.nextInt();
                attempts +=1;

                if(user_guess == actual_number){
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    tot_attempts += attempts;
                    break;
                } else if(user_guess < actual_number){
                    System.out.println("Too low !! Try Again");
                } else{
                    System.out.println("Too high !! Try Again");
                }
            }
            rounds ++;
            if(attempts == max_attempts){
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + actual_number);
            }

        
            System.out.println("Do you want to play again (yes/no)");
            String ans = in.next().toLowerCase();
            if(! ans.equals("yes")){
                break;
            }
        } while(true);
        System.out.println("\n Game Over. You have played "+rounds+" and your total attempts are "+tot_attempts);
        in.close();
    }
}