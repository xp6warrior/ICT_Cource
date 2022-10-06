package Week1;

import java.util.Scanner;

public class Exersize9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input a number: ");
        float a = Integer.parseInt(s.nextLine());
        System.out.print("Input another number: ");
        float b = Integer.parseInt(s.nextLine());
        System.out.print("\nQuotient of the numbers: "+(a/b));

    }
}
