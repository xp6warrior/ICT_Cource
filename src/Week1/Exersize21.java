package Week1;

import java.util.Scanner;

public class Exersize21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type the year: ");
        int year = Integer.parseInt(s.nextLine());

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("it is a leap year");
            } else {
                System.out.println("it is not a leap year");
            }
        } else if (year % 4 == 0) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("it is not a leap year");
        }
    }
}
