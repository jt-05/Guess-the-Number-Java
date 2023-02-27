// Libraries
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(1000);
        int attempts = 0;
        int guess = 0;

        while (number != guess)
        {
            attempts++;

            System.out.print("Your guess: ");
            guess = scanner.nextInt();

            if (guess > number)
            {
                System.out.println("Too High\n");
            }
            if (guess < number)
            {
                System.out.println("Too Low\n");
            }
        }
        System.out.println("You won in " + Integer.toString(attempts) + " attempts!");
    }
}
