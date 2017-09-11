import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("HELLO");
        int answer = new Random().nextInt(99);
        System.out.println(answer);
        Scanner scanner = new Scanner(System.in);

        int guess = -1;
        int numberOfGuess = 0;

        while(guess != answer){
            System.out.println("Please type an integer (1-99) and press enter");
            guess = scanner.nextInt(); //asks for input

            numberOfGuess += 1;

            if(guess > answer){
                System.out.println("too high!");
            } else if(guess < answer){
                System.out.println("guess is too low!");
            }

        }

        if(numberOfGuess == 1){
            System.out.printf("you only took one guess");
        } else {
            System.out.printf("you only %d took ", numberOfGuess);
        }

        System.out.println("to took you n number of guesses ");

//        System.out.println(input);



    }


}
