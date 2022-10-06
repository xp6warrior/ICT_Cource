package Week1;

import java.util.Scanner;

public class Exersize18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type in the points [0-60]: ");
        int score = Integer.parseInt(s.nextLine());
        int g = 0;
        if (score > 49) {
            g = 5;
        } else if (score > 44) {
            g = 4;
        } else if (score > 39) {
            g = 3;
        } else if (score > 34) {
            g = 2;
        } else if (score > 29) {
            g = 1;
        }

        if (g == 0) {
            System.out.println("Grade: 0 [failed]");
        } else {
            System.out.println("Grade: " + g);
        }
    }
}
