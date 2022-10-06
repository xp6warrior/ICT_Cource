package Week1;

import java.util.Scanner;

public class Exersize16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Type a number: ");
        int a = Integer.parseInt(s.nextLine());
        if (a % 2 == 0) {
            System.out.print("Number " + a + " is even");
        } else {
            System.out.println("Number " + a + " is odd");
        }
    }
}
