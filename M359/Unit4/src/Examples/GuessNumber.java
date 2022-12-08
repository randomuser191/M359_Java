package Examples;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int avgNum = (int)(Math.random() * 10 + 1);
        int tries = 1;

        System.out.println("Guess a number from 1-10.");
        int guess = input.nextInt();

        while(guess != avgNum){
            if(guess > 10 || guess < -1){
                System.out.println("The number is within 1-10.");
            }
            else if(guess > avgNum){
                System.out.println("Too High! Try again.");
            }else{
                System.out.println("Too Low! Try Again.");
            }
            tries++;
            guess = input.nextInt();
        }
        System.out.print("You got it! You guessed the number " + avgNum + " in " + tries);
        if(tries == 1){
            System.out.print(" try.");
        }else{
            System.out.print(" tries.");
        }

    }
}
