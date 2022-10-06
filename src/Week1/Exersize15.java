package Week1;

import java.util.Scanner;

public class Exersize15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How old are you?\n");
        int a = Integer.parseInt(s.nextLine());
        if (a > 17) {
            System.out.println("You have reached the age of majority");
        } else {
            System.out.println("You have not reached the age of majority");
        }
    }
}
