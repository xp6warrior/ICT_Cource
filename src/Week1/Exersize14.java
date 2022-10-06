package Week1;

import java.util.Scanner;

public class Exersize14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = Integer.parseInt(s.nextLine());
        if (a >= 0) {
            System.out.println("This number is positive");
        } else {
            System.out.println("This number is not positive");
        }
    }
}
