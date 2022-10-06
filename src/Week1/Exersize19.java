package Week1;

import java.util.Scanner;

public class Exersize19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How old are you?\n");
        int age = Integer.parseInt(s.nextLine());
        if (age <= 120 && age >= 0) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
