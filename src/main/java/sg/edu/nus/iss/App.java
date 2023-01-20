package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Integer guessNum = rand.nextInt(100);

        Integer myGuess = 0;

        Scanner input = new Scanner(System.in);

        while (myGuess != guessNum) {

            myGuess = input.nextInt();

            if (myGuess < guessNum) {
                System.out.println("The number you guessed is higher");
            } else if (myGuess > guessNum) {
                System.out.println("The number you guessed is lower");
            } else {
                System.out.println("You got it right");
                input.close();
                System.exit(0);
            }
        }
    }
}
