package Week1;

import java.util.Scanner;

public class Exersize8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input a number: ");
        int a = Integer.parseInt(s.nextLine());
        System.out.print("Input another number: ");
        int b = Integer.parseInt(s.nextLine());
        System.out.print("\nSum of the numbers: "+(a+b));

    }
}
