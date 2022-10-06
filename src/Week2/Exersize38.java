package Week2;

import java.util.Scanner;

public class Exersize38 extends Exersize37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How many times? ");
        int times = s.nextInt();

        int t = 1;
        while (t <= times) {
            printText();
            t++;
        }
    }
}
