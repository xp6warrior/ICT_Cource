package Week1;

import java.util.Scanner;

public class Exersize22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String pass = "";
        while (true) {
            System.out.println("Type the password: ");
            pass = s.nextLine();
            if (pass.equals("carrot")) {
                System.out.println("correct!\n");
                break;
            } else {
                System.out.println("incorrect!\n");
            }
        }
        System.out.println("The secret is : kim wexler feet and toes");

    }
}
