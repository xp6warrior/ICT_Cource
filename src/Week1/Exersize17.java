package Week1;

import java.util.Scanner;

public class Exersize17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type in a number: ");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("Type in another number: ");
        int b = Integer.parseInt(s.nextLine());
        if (a > b) {
            System.out.println("Greater number: " + a);
        } else if (a < b) {
            System.out.println("Greater number: " + b);
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
