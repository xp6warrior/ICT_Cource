package Week2;

import java.util.Scanner;

public class Exersize25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

// WRITE YOUR PROGRAM HERE
// USE ONLY THE VARIABLES sum, reader AND read!

        for (int i = 0; i < 3; i++) {
            System.out.println("Input integer: ");
            sum += reader.nextInt();
        }

        System.out.println("Sum: " + sum);

    }
}
